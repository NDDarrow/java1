package control;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.member_action;
import service.member_service;

/**
 * Servlet implementation class member_control
 */
@WebServlet("/member_control")
public class member_control extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, member_action> target = new HashMap<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public member_control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/member");
		Enumeration key = rb.getKeys();
		while( key.hasMoreElements() ) {
			String k = (String)key.nextElement(); // singup, signupSave 등등 키값 저장
			String value = rb.getString(k); // k의 value가져오기
			try {
				Class<?> hc1 = Class.forName(value); //클래스를 로드(객체생성하려면 클래스가 메모리에 로드 되어야 한다.);
				member_action hinst = (member_action)hc1.newInstance(); // 객체생성
				target.put(k, hinst);
			}catch(Exception e) {
				System.out.println("member.properties 파일 작업 실패");
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		process(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("only eng?");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	//GET, POST 요청에 대한 일괄처리 메서드
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버는 대부분 사용자의 주소요청에 동작한다. 주소요청이 없으면 대부분 동작하지 않는다.
		// 사용자가 요청한 주소를 보고 그에 맞는 응답 페이지 제공이나 값을 제공한다.
		// 서블렛은 사용자의 요청을 목적에 맞게 처리 하기 위한 클래스이다.
		// 서버대신해서 요청을 처리해주는 역할을 한다.
		
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		
		
		
		String cmd = uri.substring(9);
		String view = "/"; // 사용자에게 제공할 기본 페이지
		
		member_action mem = target.get(cmd);
		
		view = mem.action(request, response);
		
		if( view != null) {
			RequestDispatcher rds = request.getRequestDispatcher(view); //제공할 페이지
			rds.forward(request, response);
			// 기존의 사용자 브라우저의 내용을 교체하는 방식
			// 주소는 변경 되지 않는다.
		}
	}
}
	
	
		
	

/*
 * RequestDispatcher
 * 	- 클라이언트의 요청이 들어오면 원하는 값으로 요청을 넘기거나
 * 	  특정 값에 처리를 요청하고 처리결과를 얻어오는 기능
 *
 * 	서블렛에 의해서 사용자가 요청한 페이지를 제공하는 방법으로
 * 	response.sendRedirect가 있는데 사용자의 브라우저 주소를 변경하는
 * 	방법이라서 다시한번 재요청이 들어온다
 * 	내장객체를 새로만듬
 * 
 * 	dispatcher를 사용하면 요청에 대한 페이지를 forward 또는 include하여 제공한다.
 * 	기존에 사용하던 내장객체를 계속 사용함
 * 
 * 	MVC 패턴
 * 	M : Model - 데이터 자정 객체
 *  V : View - 클라이언트에게 제공하는 페이지
 *  C : Controller - 클라이언트의 요청을 처리
 *  
 *  control(서블렛) <--> Service <--> Database
 *  
 *  DAO - data access object (데이터베이스에 접근하기 위한 객체)
 *  DTO - data transfer object (데이터를 저장해두는 객체)
 *  VO - value object( 데이터 저장 객체 - 읽기전용)
 *  Entity - 테이블 생성과 데이블 값 저장 , 읽기, 수정, 삭제와 관련있는 클래스
 */



//
//if(cmd.equals("signup") ) { //요청 파라미터가 signup일 경우 회원가입 페이지를 요청
//	request.setAttribute("prt", "/member/signup");
//	
//	request.setAttribute("emailList", ms.emailList() );
//	// 회원가입 페이지를 제공하기위해 request객체를 이용한 것 일뿐 반드시 이와같은 방법일 필요는 없음
//	// 사용자 요청에 의한 페이지 제공은 정적페이지(.html, .jsp 등) 그대로 제공할 수도 있고
//	// 위와 같이 include 방식으로 제공 할 수 있다.
//}else if( cmd.equals("signSave") ) {
//	view = ms.insert(request, response);
//}



