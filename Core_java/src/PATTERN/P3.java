package PATTERN;

public class P3 {
	
public static void main(String[] args) {
		
		int lines=5;
		int starCount=5;
		int spaceCount=lines+1;
		
		for(int j=1;j<=lines;j++) {
			
			for(int k=5;k<=spaceCount;k++) {
				
				System.out.print(" ");
			}
			
			for(int i=1;i<=starCount;i++) {
				
				System.out.print("*");
			}
			System.out.println();
			spaceCount++;
			starCount--;
			
		}
	}

}
