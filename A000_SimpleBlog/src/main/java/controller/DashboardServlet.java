package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.BlogDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Blog;

@WebServlet("/dashboard")
public class DashboardServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BlogDao blog=new BlogDao();
        ArrayList<Blog> al=blog.getAllBlogs();	
		req.setAttribute("data", al);
		req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
	}
	
	
}
