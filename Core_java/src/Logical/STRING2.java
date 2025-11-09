package Logical;

public class STRING2 {
	
public static void main(String[] args) {
		
		String Str="racecar";
		Boolean isPalindrome=true;
		
		int n=Str.length();
		
		for(int i=0;i<n/2;i++) {
			if(Str.charAt(i)!=Str.charAt(n-i-1)) {
				isPalindrome=false;
				break;
			}
		}
			if(isPalindrome) {
				System.out.print(Str +"is palindrome");
			}
			else {
				System.out.print(Str +"is not palindrome");
			}
			System.out.println();
		}
	}
