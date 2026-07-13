package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	User u=new User();
	u.setName(req.getParameter("name"));
	u.setEmail(req.getParameter("email"));
	u.setPassWord(req.getParameter("passWord"));
	
	new UserDao().register(u);
	resp.sendRedirect("login.jsp");
	}
}
