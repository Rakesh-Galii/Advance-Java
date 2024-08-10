package rdi_srdm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cls1")
public class Class1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
//		RequestDispatcher dispatcher=req.getRequestDispatcher("b.html");
//		dispatcher.forward(req,resp);
		
		String name=req.getParameter("ename");
		System.out.println("class 1-->"+ name);
//		
		RequestDispatcher dispatcher=req.getRequestDispatcher("cls2");
		dispatcher.forward(req, resp);
		
		
		//RequestDispatcher is the interface & it is used to send the data from one source/file to other source/file with in the server only
//		RequestDispatcher dispatcher=req.getRequestDispatcher("https://www.facebook.com");
//		dispatcher.forward(req, resp);  //404 Error (not found)
		
		// to over come this we Use -->sendRedirect("url")
		
		//sendRedirect(Abstract method belongs to HttpServletResponse Interface)--->we can send data between the servers
		
//		resp.sendRedirect("cls2");   //but it does not carry the data bcz each and every request act as a new request(HTTP is stateless protocol)
//		resp.sendRedirect("https://www.facebook.com");
//		resp.sendRedirect("http://www.instagram.com");
		
//		resp.sendRedirect("http://whatsapp.com");
		
		
	}
	

}
