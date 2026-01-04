package Controller;

import java.io.IOException;

import Dao.UserDao;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class regController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String[] lang=req.getParameterValues("lang");
		String country=req.getParameter("country");
		String Adderss=req.getParameter("address");
		
		String lng="";
		for(String l:lang) {
			lng=lng+l+",";
		}
		
		User user=new User();
		user.setName(name);
		user.setEmaill(email);
		user.setPass(pass);
		user.setGender(gender);
		user.setLang(lng);
		user.setCountry(country);
		user.setAddress(Adderss);
		
		UserDao dao=new UserDao();
		
		if(dao.isEmailExist(email)) {
			
		req.setAttribute("Err", "Email alredy exist !!!");
		req.getRequestDispatcher("reg.jsp").forward(req, resp);
	
		}
		else {
		int i=dao.addUser(user);
		if(i>0) {
			req.setAttribute("msg", "registration successfully !!!");
			req.getRequestDispatcher("reg.jsp").forward(req, resp);
		}
		}
	}
}
