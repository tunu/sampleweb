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
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<body style='background-color:#82CEE5;'>");
		out.println(""<marquee width=200 direction=left><img src="http://www.krazy-kreations.com/images/babies/0059.gif"></marquee>");
		out.print("<h1><marquee> Integrating code change state3 </marquee>.."+new java.util.Date()+"</h1>");
		out.print("<h1><marquee direction="right"> Docker helps rapid application deployment </marquee>.."+new java.util.Date()+"</h1>");
		out.print("<h1><marquee behavior="alternate"> Docker helps portability across machines </marquee>.."+new java.util.Date()+"</h1>");
		out.print("<h1><marquee direction="up" behavior="alternate" style="height:1000px"> Docker helps sharing and minimal overhead </marquee>.."+new java.util.Date()+"</h1>");
		out.print("<h1><marquee style="border:RED 3px SOLID"> Docker containers are lightweight </marquee>.."+new java.util.Date()+"</h1>");
		out.print("<h1><marquee> Shippable <img src="https://www.docker.com/sites/all/themes/docker/assets/images/logo.png" width="150" height="100" alt="Tutorials" border="0"></marquee>"+new java.util.Date()+"</h1>");
		
		out.flush();
		out.close();	}
}
