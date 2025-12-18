package Project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		StudentService service=new StudentService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("\n===========Student management System===========");
			System.out.println("1. Add Student ");
			System.out.println("2. Display Student");
			System.out.println("3. Search Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Update Student");
			System.out.println("6. Exit");
			System.out.println("enter your chioce");
			
			int chioce=sc.nextInt();
			
			switch(chioce) {
			
			case 1:
				System.out.println("enter id: ");
				int id =sc.nextInt();
				sc.nextLine();
				
				System.out.println("enter name: ");
				String name=sc.nextLine();
				
				System.out.println("enter course: ");
				String course=sc.nextLine();
				
				System.out.println("enter marks: ");
				double marks=sc.nextDouble();
				
			   service.AddStudent(new Student(id, name, course, marks));
			   break;
			   
			case 2:
				service.viewStudent();
				break;
				
			case 3:
				System.out.println("enter id to search");
				int idSearch=sc.nextInt();
				Student s=service.searchStudent(idSearch);
				if(s != null) {
					System.out.println("Student found:"+s);
				}
				else {
					System.out.println("Student not found");
				}
				break;
				
			case 4:
				System.out.println("enter id to delete");
				int did=sc.nextInt();
				boolean Deleted = service.deleteStudent(did);
				
				if(Deleted) {
					System.out.println("Student deleted successfully");
				}
				else {
					System.out.println("Student not found");
				}
				break;
				
			case 5:
				System.out.println("enter id to update");
				int uid=sc.nextInt();
				sc.nextLine();
				
				System.out.println("enter the new name");
				String newName=sc.nextLine();
				
				System.out.println("enter the new course");
				String newCourse=sc.nextLine();
				
				System.out.println("enter the new marks");
				double newMarks=sc.nextDouble();
				
				boolean updated=service.updateStudent(uid, newName, newCourse, newMarks);
				if(updated) {
					System.out.println("Student update succeessfully");
				}
				else {
					System.out.println("Student not found");
				}
				break;
				
			case 6:
				System.out.println("thank you");
				System.exit(0);
				
				defaulat :
					System.out.println("Invalid chioce");
					
			}
		}
	}

}
