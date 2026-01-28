package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Student;

public class StudentDao {

	Connection cn=null;
	public StudentDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/28aug_2025_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int AddStudent(Student st) {
	
		int i=0;
		
		try {
			PreparedStatement ps=cn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPhone());
			
			i=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public ArrayList<Student> ViewStudent() {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		try {
			PreparedStatement ps=cn.prepareStatement("select * form student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				Student st=new Student();
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setEmail(rs.getString("email"));
				st.setPhone(rs.getString("phone"));
				al.add(st);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
}
