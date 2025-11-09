package Fileio;

import java.io.Serializable;

public class Student implements Serializable {
	
	int id=10;
	String name="naitik";
	transient String email="naitikp701@gmail.com";

	public void display() {
		System.out.println(id+" "+name+" "+email);
	}
}
