package assignment;

public class STRING {
	public static void main(String[] args) {
		
		String s="racecar";
				
		String reverse=new StringBuilder(s).reverse().toString();
		
		System.out.println("origanal: "+ s);
		System.out.println("reversed: "+ reverse);
		
		if(s.equals(reverse)) {
			System.out.println("String is palindrome :"+s);
		}
		else {
			System.out.println("String is not palindrome :"+s);
		}
	}
}
