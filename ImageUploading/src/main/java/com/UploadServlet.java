package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@MultipartConfig
@WebServlet("/upload")
public class UploadServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname=req.getParameter("uname");
	    Part image=req.getPart("image");
		
		String iname=Paths.get(image.getSubmittedFileName())
				     .getFileName().toString();
		
		String path=req.getServletContext().getRealPath("/");
		String mypath=path+File.separator+"img";
		System.out.println(mypath);
		File f=new File(mypath);
		if(!f.exists()) {
			
			f.mkdir();
		}
		
		image.write(mypath+File.separator+iname);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/upload","root","root");
			
			PreparedStatement ps=cn.prepareStatement("insert into user values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, iname);
			
	        ps.executeUpdate();
			 
	        req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			  resp.getWriter().println("Error: " + e.getMessage());
		}
	}
	
}
