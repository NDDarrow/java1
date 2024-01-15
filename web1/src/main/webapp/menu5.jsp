<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	String user = null;
	if( session.getAttribute("user") != null){
		user = (String)session.getAttribute("user");
	}
	if(user == null){
		
%>
    <script> alert("로그인 후 이용하세요"); history.back();</script>
<% }else{ %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 마지막 메뉴 5 pg</h1>
</body>
</html>

<% } %>