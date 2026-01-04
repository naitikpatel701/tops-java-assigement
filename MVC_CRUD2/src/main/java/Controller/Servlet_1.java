package Controller;

import java.io.IOException;

import Dao.StudentDao;
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Servlet_1 extends HttpServlet{
	private static final long serialversionuid=1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().append("Served at:").append(req.getContextPath());
	}

	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		 String name=req.getParameter("name");
		 String email=req.getParameter("email");
		 String phone=req.getParameter("phone");
		 
		 Student st=new Student();
		 st.setName(name);
		 st.setEmail(email);
		 st.setPhone(phone);
		 
		 StudentDao dao=new StudentDao();
		 int i=dao.AddStudnt(st);
		 if(i>0) {
			 
			 req.setAttribute("msg","regstrion successfully");
			 req.getRequestDispatcher("Index.jsp").forward(req, resp);
		 }
	}
}
