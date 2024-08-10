package servlet_proj1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_proj1.dao.Studentdto;
import servlet_proj1.dto.Studentdao;


@WebServlet("/fall")  //localhost:8081/servlet_proj1/fall --->in browser
public class FindAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		 Studentdao studentdao = new Studentdao();
		 List<Studentdto> list= studentdao.findAll();
		 resp.getWriter().print(list);
		
	}

}
