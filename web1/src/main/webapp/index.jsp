<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList , java.util.LinkedList"
	session = "false" errorPage="error.jsp" isErrorPage="true"
	buffer="32kb" autoFlush="true"
%>



<%!
//선언부 - 메서드 정의,
public int sum(int a, int b){
	return a+b;
}
%>
<%
//스크립틀릿 - 변수, 배열, 객체, 조건문, 반복문, 메서드 실행
//<@= -> 표현식
int num = 10;

String name = "이순신";
if(num >5){
	num=15;
}
String[] names = {"이순신","김유신","쇠똥구리","존 스튜어트 밀","김춘자","마르크스"};

%>

<%= //출력부 - 내용을 출력하는 부분
num
%> 

<%--스트립틀릿(서버측) 주석
내장객체 - jsp파일이 서버에서 실행 될 때 참조되는 객체들이다.
 확장자를 jsp라고 해주어야 내장객체를 사용할 수 있다. 예외는 있다.-> 타임리프 같은 거 사용할때
 내장객체의 종류
 	request(매우중요, 사용빈도 높음) - 클라이언트의 요청정보를 저장하고 있는 객체
 	response(매우중요, 사용빈도 높음) - 요쳥에 대한 응답정보를 저장하는 객체
 	session(매우중요, 사용빈도 높음) - 클라이언트가 저버에 접속 했을때 연결을 위해 정보를 저장하는 객체
 	application - 서버의 정보를 가지고 있는 객체, 서버에 한개만 존재하는 객체다
 	out - 출력 용 객체(java의 System.out.print가 객체로 들어온 것)
 	page - 특정 페이지의 서블릿객체, jsp페이지의 다른 내장객체 들에 접근이 가능하다.
 	pageContext - 현재 jsp 페이지에 실행 가능한 정보를 저장하고있는 객체, 나른 내장객체에 접근 가능
 	config(사용빈도 낮음) - 서블릿 설정 정보를 가지고 있는 객체
 	exception - 예외처리 객체



--%>
<!-- 
<% %> -server 측의 코드

 --> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">	
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	
	<div id="wrap">
		<ul>
			<%
				for(int i = 0; i < names.length; i++){
			%>
				<li><%=names[i]%> </li>
				<% } %>
		</ul>
	</div>
	<form method="get" action="test.jsp">
		<input type='text' name='name' placeholder="이름"> <br>
		<input type='text' name='age' placeholder="나이"> <br>
		<input type='text' name='tel' placeholder="연락처"> <br>
		<input type='checkbox' name='interest' value='게임'> 게임
		<input type='checkbox' name='interest' value='영화'> 영화
		<input type='checkbox' name='interest' value='car'> 자동차
		<button> 전송</button>
	</form>
	
	
</body>
</html>