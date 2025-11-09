package Exception;

import java.util.Scanner;

class votingAgeException extends Exception{
	
	String massage;
	public votingAgeException(String massage) {
		super(String.format("your age need more : %s",massage));
		this.massage=massage;
	}
	
}

class VotingAgeDemo{
	
	public void VoteingAge(int age) throws votingAgeException {
		
		 int remaining = 18 - age;
		if(age<18) {
			throw new votingAgeException("your age is " +age+ "you are not eligble for voting !" + "you need" +remaining+ "more year to voting");
		}
		else {
			System.out.println("you eligble for voting !");
		}
	}
}

public class Costum_exception {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		
		VotingAgeDemo a=new VotingAgeDemo();
		try {
			a.VoteingAge(age);
		} catch (votingAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
