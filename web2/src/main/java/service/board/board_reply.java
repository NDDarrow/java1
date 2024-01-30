package service.board;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.board_dao;
import DTO.member;
import DTO.reply;

public class board_reply implements board_action{
	public board_dao dao = new board_dao();
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response)throws IOException {
		int board_id = Integer.parseInt( request.getParameter("board_id") );
		String comment = request.getParameter("comment");
		member user = (member)request.getSession().getAttribute("user");
		int member_id = user.getNum();
		String writer = user.getName();
		if(comment != "") {
		reply re = new reply(board_id, member_id, comment, writer );
		dao.insert_reply(re);
		}
		
		
		response.sendRedirect("/board_read.do?id="+board_id);
		return null;
	}

}
