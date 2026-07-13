package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User u=new UserDao().login(
				req.getParameter("email"),
			    req.getParameter("passWord")
			    );
		
		if(u!= null) {
			req.setAttribute("user", u);
			resp.sendRedirect("dashboard");
		}
		else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
