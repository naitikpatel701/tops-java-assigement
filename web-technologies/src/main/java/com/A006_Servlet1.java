package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class A006_Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		resp.setHeader("Custom-Header", "hello naitik");
		resp.setHeader("App-Version", "1.0");
		
		PrintWriter pw=resp.getWriter();
		
		pw.append("<html><body>");
		pw.append("<h2>HTTP Request Header</h2>");
		
		Enumeration<String> headerNames=req.getHeaderNames();
		
		while(headerNames.hasMoreElements()) {
			String name=headerNames.nextElement();
			String value=req.getHeader(name);
			
			pw.append("<b>"+name+":</b>"+value+"<br>");
			  
		}
		pw.append("</body></html>");
			}
}
