package Project;

import java.util.ArrayList;

public class StudentService {
	
	ArrayList<Student> list=new ArrayList<Student>();
	
	//add student
	public void AddStudent(Student s) {
		list.add(s);
		System.out.println("Student added successfully");
	}
	
	//display student
	public void viewStudent() {
		if(list.isEmpty()) {
			System.out.println("Student not found");
			return;
		}
		for(Student s : list) {
			System.out.println(s);
		}
	}
	
	//search student
	public Student searchStudent(int id) {
		for(Student s : list) {
			if(s.getId()==id) {
				return s;
			}
		}
		return null;
	}
	
	//delete student
	public boolean deleteStudent(int id) {	
		Student s=searchStudent(id);
		if(s != null){
			list.remove(s);
			return true;
		}
		return false;
	}

	//update student
	public boolean updateStudent(int id, String name, String course, double marks) {
		Student s=searchStudent(id);
		if(s != null) {
			s.setName(name);
			s.setCourse(course);
			s.setMarks(marks);
			return true;
		}
		return false;
	}
}
