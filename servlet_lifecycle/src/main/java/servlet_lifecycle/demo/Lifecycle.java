package servlet_lifecycle.demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/lifecycle")
public class Lifecycle implements Servlet {
	
//constructor
	public Lifecycle() {
		System.out.println("Servlet class is loaded and servlet instance/object is created");
	}
	
	public void init(ServletConfig arg0) throws ServletException {

		System.out.println("init() method is invoked, establish database connections");
		
	}

	

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}



	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service() method is invoked,request is handled & response is sent to front-end");
		
	}
	
	public void destroy() {
		System.out.println("destroy() method is invoked, instace/object is destroyed");
		
	}
	

}
