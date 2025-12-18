package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connect");
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/28aug_2025_java","root","root");
			System.out.println("Connection estabised");
			
			PreparedStatement st=cn.prepareStatement("insert into student value(?,?,?)");
			st.setInt(1, 0);
			st.setString(2, name);
			st.setString(3, email);
			
			int i=st.executeUpdate();
			
			if(i>0) {
				System.out.println("data instred");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
