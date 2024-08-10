package servlet_proj1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_proj1.dao.Studentdto;
import servlet_proj1.dto.Studentdao;

@WebServlet("/update")
public class Modify extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
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
		
		String msg=studentdao.update(studentdto);
		resp.getWriter().print(msg);
		
	}

}
