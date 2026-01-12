package Assessment;

import java.util.Scanner;

public class Course {
	public static void main(String[] args) {
		
		CourseManagement course=new CourseManagement();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\n===========Course management System===========");
			System.out.println("1. Add Course ");
			System.out.println("2. View Course");
			System.out.println("3. Search Course");
			System.out.println("4. Delete Course");
			System.out.println("5. Edit Course");
			System.out.println("6. Exit");
			System.out.println("enter your chioce");
			
			int chioce=sc.nextInt();
			sc.nextLine();
			
			switch(chioce) {
			
			case 1 :
				
				System.out.println("*****Add Course*****");
				course.addCourse();
				break;
				
			case 2:
				
				System.out.println("*****View Course*****");
				course.viewCourse();
				break;
				
			case 3:
				
				System.out.println("*****Search Course*****");
				course.searchCourse();
				break;
				
			case 4:
				
				System.out.println("*****Delete Course*****");
				course.deleteCourse();
				break;
				
			case 5:
				
				System.out.println("*****Edit Course*****");
				course.editCourse();
				break;
				
			case 6:
				
				System.out.println("*****Thank you*****");
				System.exit(0);
			
				
			default :
				
				System.out.println("Invalid Choice");
			}	
		}
	}

}
