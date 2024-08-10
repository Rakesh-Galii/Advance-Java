package rdi_srdm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cls2")
public class Class2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String name=req.getParameter("ename");
		System.out.println("class2 -->"+ name);  
		
		//Using RequestDispatcher we get data(It will carry the data )-->req.getRequestDispatcher()
		//Using sendredirect() we will not get the data(it does not carry the data)-->resp.sendRedirect()
		//we get class2-->null
		
	}
	

}
