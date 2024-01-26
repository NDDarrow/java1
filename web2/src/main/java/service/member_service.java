package service;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import DAO.member_dao;
import DTO.member;

public class member_service implements member_action {
	private member_dao mdao = new member_dao();
	
	public String[] emailList() {
		return mdao.findAllEmail();
	}
	public int findNum() {
		return mdao.num();
	}
	int num = findNum();
	
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response)  throws  IOException, ServletException  {
		
		String path="C:\\NDDarrow\\java1\\java1\\web2\\src\\main\\webapp\\static\\image";
		int size = 1024*1024*20;
		String face = null;
		
		
		try {
			MultipartRequest mr = new MultipartRequest( request, path, size, "UTF-8", new DefaultFileRenamePolicy() );
			Enumeration em = mr.getFileNames();
			String file = (String)em.nextElement();
			face = mr.getFilesystemName(file);
			
				
			
			String email = mr.getParameter("email");
			String pw  = mr.getParameter("pin");
			String name = mr.getParameter("name");
			String tel = mr.getParameter("tel");				
			mdao.insert( new member(email, pw, name, tel) );
			response.sendRedirect("/members/signIn");
				

			
		}catch(Exception e){
				System.out.println("파일 업로드 실패");
				e.printStackTrace();
		}
		
		

		mdao.pictureInsert( face, num+1 );
		return null;
			
	}
	
}


