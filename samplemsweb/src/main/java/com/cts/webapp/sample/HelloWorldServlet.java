package com.cts.webapp.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1031422249396784970L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		out.println("<!DOCTYPE html>");  // HTML 5
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         String title = rb.getString("Integrating code change state2.title");
out.println("<body style='background-color:#d3d3d3;'>");

		out.print("<h1>Date::"+new java.util.Date()+"</h1>");
		out.println("<html><body bgcolor="+c1+"> <font color="+ c2 +"> Integrating code change state2  </font> </body></html>");
         out.println("<title>" + title + "</title></head>");
         out.println("<body>");
         out.println("<h1>" + title + "</h1>");  
         
         out.println("<a href='" + request.getRequestURI() + "'><img src='images/return.gif'></a>");
         out.println("</body></html>");
		
		
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.print("<h1> Integrating code change state3 .."+new java.util.Date()+"</h1>");
		out.flush();
		out.close();	}
}
