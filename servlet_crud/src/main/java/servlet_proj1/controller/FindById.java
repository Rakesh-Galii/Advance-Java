package servlet_proj1.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_proj1.dao.Studentdto;
import servlet_proj1.dto.Studentdao;



@WebServlet("/fid")
public class FindById extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("pk");
		int cid=Integer.parseInt(id);
		
		System.out.println(cid);
		
		Studentdao studentdao=new Studentdao();
		Studentdto studentdto=studentdao.findbyid(cid);
		res.getWriter().print(studentdto);
		
		
		
		
	}
	
	

}
