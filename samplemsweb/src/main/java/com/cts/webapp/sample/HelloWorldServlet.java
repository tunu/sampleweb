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
		out.println("<marquee direction=left><img src=http://www.krazy-kreations.com/images/babies/0059.gif></marquee>");
		out.print("<h1><marquee> Integrating code change on DOCKER container </marquee>"+new java.util.Date()+"</h1>");
		out.print("<h1><marquee>Integrating code change state3</marquee>..</h1>");
		out.print("<h1><marquee direction=right> Docker helps rapid application deployment </marquee></h1>");
		out.print("<h1><marquee behavior=alternate> Docker helps portability across machines </marquee></h1>");
		out.print("<h1><marquee direction=up behavior=alternate style=height:100px> Docker helps sharing and minimal overhead </marquee></h1>");
		out.print("<h1><marquee style=border:RED 3px SOLID> Docker containers are lightweight </marquee></h1>");
		out.print("<h1><marquee> Shippable <img src=https://www.docker.com/sites/all/themes/docker/assets/images/logo.png width=300 height=100 alt=Tutorials border=0></marquee></h1>");
		out.println("<marquee direction=right><img src=http://www.krazy-kreations.com/images/babies/0059.gif></marquee>");
		out.print("<h1><marquee behavior=alternate direction=up width=80%><marquee direction=right behavior=alternate>Know more about docker from here https://www.docker.com/</marquee></marquee></h1>");
		out.flush();
		out.close();	}
}






//        int a1= Integer.parseInt(request.getParameter("n1"));
  //      int a2= Integer.parseInt(request.getParameter("n2"));
 //       if(request.getParameter("r1")!=null)
//        {
//            out.println("<h1>Addition</h1>"+(a1+a2));
//        }
  //      if(request.getParameter("r2")!=null)
    //    {
//            out.println("<h1>Substraction</h1>"+(a1-a2));
  //      }
  //      if(request.getParameter("r3")!=null)
 //       {
//            out.println("<h1>Multiplication</h1>"+(a1*a2));
//        }if(request.getParameter("r1")!=null)
 //       {
  //          out.println("<h1>Division</h1>"+(a1/a2));
   //     }
        
