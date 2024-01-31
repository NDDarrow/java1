package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.member_dao;

public class member_forget implements member_action{
	private member_dao dao =new member_dao();
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setAttribute("prt", "member/authSend");
		return "/";
	}
	
}
