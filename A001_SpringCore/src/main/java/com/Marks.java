package com;

public class Marks {
	
    String Subject;
    String marks;
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
    public void display() {
		
    	System.out.println(Subject+" "+marks);
	}
}
