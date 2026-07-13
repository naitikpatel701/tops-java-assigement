package controller;

import java.io.IOException;
import java.util.List;

import dao.BlogDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Blog;
import model.User;

@WebServlet("/blog")
public class BlogServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 List<Blog> blogs = new BlogDao().getAllBlogs();
		 req.setAttribute("blogs", blogs);
		 req.getRequestDispatcher("dashboard").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		User u=(User) req.getSession().getAttribute("user");
		
		 if (u != null) {
		        Blog b = new Blog();
		        b.setUser(u);
		        b.setTitle(req.getParameter("title"));
		        b.setContent(req.getParameter("content"));
		        b.setTags(req.getParameter("tags"));
		        
		    new BlogDao().addBlog(b);
		    resp.sendRedirect(req.getContextPath()+ "/blog");
	}
		 else {
			 resp.sendRedirect(req.getContextPath()+"/login.jsp");
		 }
}
}