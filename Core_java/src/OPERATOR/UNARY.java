package OPERATOR;

public class UNARY {
	
public static void main(String[] args) {
		
		int a=17;
		int b= --a + --a - a++ + ++a;
		
		System.out.println(a);
		System.out.println(b);
	}

}
