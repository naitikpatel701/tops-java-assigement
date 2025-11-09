package Logical;

public class PALINDROME {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123454321;
		int temp = num;
		int sum = 0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum*10  +rem;
			num = num/10;
		}
	
		if(temp==sum)
		{
			System.out.println("Pelindrome");
		}
		else
		{
			System.out.println("Not pelindrome");
		}
	
		
	}

}
