package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.member_dao;
import DTO.member;

public class member_login implements member_action{
	private member_dao dao = new member_dao();
	
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if( request.getParameter("cmd")== null){
			request.setAttribute("prt","member/signin");
			return "/";	
		}else {
			String email = request.getParameter("email");
			String pw = request.getParameter("pin");
			String preUrl = request.getParameter("cmd");
			
			member user =  dao.findByemailpw(email, pw);
			if( user == null ) {// 로그인 실패
				request.setAttribute("fail","1");
				request.setAttribute("prt","member/signin");
				return "/";
			}else { //로그인 성공
				dao.login_record(user.getNum(), request.getRemoteAddr() ); //로그인 기록
				dao.getPicture(user);
				request.getSession().setAttribute("user", user);
			}
			response.sendRedirect(preUrl);
			return null;
		}
	}
};
