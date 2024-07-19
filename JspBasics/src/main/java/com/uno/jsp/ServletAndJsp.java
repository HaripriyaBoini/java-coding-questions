package com.uno.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_Jsp")
public class ServletAndJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletAndJsp() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("text/html");
//		PrintWriter pWriter=response.getWriter();
		// pWriter.print("Hi This is dynamic content code");   //this data is simply printed with no colors ie.,no buisness logic
		
//		pWriter.print("<!DOCTYPE html>\r\n"
//				 +"<html>\r\n"
//				 +"<head>\r\n"
//				 +"<meta charset=\"UTF-8\">\r\n"
//				 +"<title>Insert title here</title>\r\n"
//				 +"</head>\r\n"
//				 +"<body>\r\n"
//		);
//
//		 pWriter.print("<p style='font-size:18px;color:green;text-decoration:underline;'>This content is dynamically prepared</p>");
//		 pWriter.print("</body>");
//		 pWriter.print("</html>");
//		 
//		 pWriter.close();

		
		response.sendRedirect("ex02_servlet_jsp.jsp?greetings=Hello,Goodafternoon");
		
		
	}

}
