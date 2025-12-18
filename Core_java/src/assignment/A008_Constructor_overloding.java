package assignment;

class Student{
	
	int id;
	String name;
	String email;
	int age;

	//constructor1(no paramater)
   Student(){
	
	   id=101;
	   name="naitik";
	   email="naitikp701@gmail.com";
	   age=22;
	   
   } 
   
   //constructor2(one paramater)
   
   Student(int i){
	   
	   id=i;
	   name="pal";
	   email="pal@gmail.com";
	   age=18;
   }
   
   //constructor3(two paramater)
   
   Student(int i,String s){
	   
	   id=i;
	   name=s;
	   email="neel@gmail.com";
	   age=20;
			   
   }
   
   //constructor4(three paramater)
   
   Student(int i,String s,String m){
	   
	   id=i;
	   name=s;
	   email=m;
	   age=19;
   }
   
   //constructor5(all paramater)
   Student(int i,String s,String m,int b){
	   id=i;
	   name=s;
	   email=m;
	   age=b;
   }
   
   public void dispaly() {
	System.out.println("id :"+id+" , name :"+name+" , email :"+email+" , age :"+age);
}
   }

public class A008_Constructor_overloding {
	public static void main(String[] args) {
		
		
		Student s=new Student();
		Student s1=new Student(102);
		Student s2=new Student(103,"neel");
		Student s3=new Student(104,"gopal","gopal@gmail.com");
		Student s4=new Student(105,"drashn","drashn@gmail.com",24);
		
		s.dispaly();
		s1.dispaly();
		s2.dispaly();
		s3.dispaly();
		s4.dispaly();
	}

}
