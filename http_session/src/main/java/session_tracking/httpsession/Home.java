package session_tracking.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
//		
//		String un=req.getParameter("username");
//		resp.getWriter().print("hi" +" "+un);    
		
		
		//Http is stateless protocal bcz each request act like a new request  
		// we will get output as "hi null"  (bcz it will not carry the data)
		
		
	
//		then we go with the session tracking to maintain the session 
		
		HttpSession session=req.getSession();
		String un=(String) session.getAttribute("k1");
//		session.setMaxInactiveInterval(30); //it is used in banking application to expire the session after a particular seconds( takes Integer value)
		
		resp.getWriter().print("hi"+ " "+un);
		
		session.invalidate();  //it is used to destroy the object of Session
		
		resp.setContentType("text/html");  //we get the text insted of link(logout) we will get Entered TEXT will Display on UI to avoid that we use resp.setContentType("text/html");
		
		resp.getWriter().print("<br>");
		resp.getWriter().print("<a href='logout'>logout</a>");
		
	}

}
