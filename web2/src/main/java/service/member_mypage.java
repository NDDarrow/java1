package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.member_dao;
import DTO.LoginHistory;
import DTO.member;

public class member_mypage implements member_action {
	private member_dao dao = new member_dao();
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		// 현재 로그인한 회원의 정보는 세션객체의 user에 저장되어있다.
		member user = (member)request.getSession().getAttribute("user");
		
		// 로그인 기록을 가져오기 위해 로그인한 회원의 번호(id)를 넘겨준다.
		
		// 넘겨준 번호를 기반으로 로그인 기록을 내려받는다
		List<LoginHistory> login_list = dao.getHistory( user.getNum() );
		
		request.setAttribute("login_list", login_list);
		request.setAttribute("prt", "member/info");
		return "/";
	}
}
