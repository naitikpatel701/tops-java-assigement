package Controller;

import java.io.IOException;

import Dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("sid"));
		
		StudentDao dao=new StudentDao();
		int i=dao.DeleteStudent(id);
		
		if(i>0) {
			
			req.getRequestDispatcher("display").forward(req, resp);
		}
	}

}