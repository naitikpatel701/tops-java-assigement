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

@WebServlet("/spo")

public class spoServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String qty=req.getParameter("qty");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/28aug_2025_java","root","root");
			
			PreparedStatement ps=cn.prepareStatement("insert into sports values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, name);
		    ps.setString(3, qty);
		    
		    int i=ps.executeUpdate();
		    if(i>0) {
		    	req.setAttribute("msg", "connection success");
		    	req.getRequestDispatcher("Item.jsp").forward(req, resp);
		    }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
