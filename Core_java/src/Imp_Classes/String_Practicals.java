package Imp_Classes;

public class String_Practicals {
	public static void main(String[] args) {
		
	String s = "sun Rises in east ";
		
		//east in rises sun
		//tsae ni sesiR nus
		//nus sesir ni tsae
		//east rises in sun
		
		
		String words[] = s.split(" ");
	for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
			System.out.println();
	}
	
		System.out.println("*****************");
		char ch[] = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			System.out.println();
		}
		
		System.out.println("*******************");
		String w[] = s.split(" ");
		for (int i = 0; i < w.length; i++) {
	   char c[] = w[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("*************");
		String b[] = s.split(" ");
		String temp = b[0];
		b[0] = b[b.length-1];
		b[b.length-1] = temp;
				
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
