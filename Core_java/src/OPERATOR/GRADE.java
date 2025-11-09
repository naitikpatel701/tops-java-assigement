package OPERATOR;

public class GRADE {

public static void main(String[] args) {
		
		
		// marks=48[0-100]
		
		int marks=95;
		
		if(marks>91 && marks<=100) {
			System.out.println("grade A");
		}
		else if(marks>71 && marks<=90) {
			System.out.println("grade B");
		}
		else if(marks>51 && marks<=70) {
			System.out.println("grade C");
		}
		else if(marks>36 && marks<=50) {
			System.out.println("grade D");
		}
		else if(marks>0 && marks<=35) {
			System.out.println("grade E");
		}
		else {
			System.out.println("invalid operator!");
		}
	}

}
