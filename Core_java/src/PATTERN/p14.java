package PATTERN;

public class p14 {
	
	 public static void main(String[] args) {
			
		 int n=5;
		 
		 for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					
					if(j==0 || j==4 || (i==j && i<=2) || (i+j==4 && i<=2)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			}	
		}
				System.out.println();
		}
	}


}
