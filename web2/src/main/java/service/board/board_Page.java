package service.board;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class board_Page implements board_action{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//로그인 안하고 주소입력하여 강제 진입 방지
		if( request.getSession().getAttribute("user") == null ) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter().append("" + "<script> alert('로그인 후 이용하세요'); history.back();</script>");	
			
			return null;
		}
		//정상적으로 로그인을 통한 진입시
		request.setAttribute("prt", "board/write");
		
		return "/";
	}

}
