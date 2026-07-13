package controller;

import java.io.IOException;

import dao.BlogDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	int id=Integer.parseInt(req.getParameter("id"));
    	
    	BlogDao dao=new BlogDao();
    	int i=dao.deleteBlog(id);
    	if(i>0) {
    		req.getRequestDispatcher("/dashboard").forward(req, resp);
    	}
    	
    }
}
