package servlet_proj1.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_proj1.dao.Studentdto;
import servlet_proj1.dto.Studentdao;


@WebServlet("/abc")
public class Create implements Servlet {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("sid");
		String name=req.getParameter("sname");
		String email=req.getParameter("semail");
		String date=req.getParameter("sdob");
		String number=req.getParameter("snumber");
		String gender=req.getParameter("gender");
		String country=req.getParameter("scountry");
		
		//System.out.println(id+" " +name);
//		res.getWriter().print(id+" "+name);
		
		int cid=Integer.parseInt(id);
		long cnumber=Long.parseLong(number);
		
		
		
		Studentdto studentdto=new Studentdto();
		studentdto.setId(cid);
		studentdto.setName(name);
		studentdto.setMail(email);
		studentdto.setDob(date);
		studentdto.setNumber(cnumber);
		studentdto.setCountry(country);
		studentdto.setGender(gender);
		
		System.out.println(studentdto);
		
		
		
		Studentdao studentdao=new Studentdao();
		
		String msg=studentdao.insert(studentdto);
		res.getWriter().print(msg);
		
		
		
		
		
		
		
	}
	

}
