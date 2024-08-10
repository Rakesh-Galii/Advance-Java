package servlet_proj1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_proj1.dao.Studentdto;
import servlet_proj1.dto.Studentdao;


@WebServlet("/falljsp")
public class FetchAlljsp  extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		 Studentdao studentdao = new Studentdao();
		 List<Studentdto> list= studentdao.findAll();
//		 resp.getWriter().print(list);
//		 resp.getWriter().print("<h1> Hello</h1>");
		 
		 req.setAttribute("abc", list);
		 
		 RequestDispatcher dispatcher=req.getRequestDispatcher("fetchall.jsp");
		 dispatcher.forward(req, resp);
		
	}

}
