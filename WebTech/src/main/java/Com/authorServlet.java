package Com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/author")

public class authorServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		String Qty=req.getParameter("Qty");
		String price=req.getParameter("price");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/28aug_2025_java","root","root");
			
			PreparedStatement ps=cn.prepareStatement("insert into book values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, name);
			ps.setString(3, Qty);
			ps.setString(4, price);
			
			int i=ps.executeUpdate();
			if(i>0) {
				req.setAttribute("msg","book adding success");
				req.getRequestDispatcher("book.jsp").forward(req, resp);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
