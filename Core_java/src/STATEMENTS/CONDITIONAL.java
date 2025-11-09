package STATEMENTS;

public class CONDITIONAL {
	
    public static void main(String[] args) {
		
    	int a=10;
    	int b=20;
    	int c=30;
    	
    	if(a>b)
   		{
    			if(a>c) {
    				System.out.println("A is greater");
    			}
    			else
    			{
    				System.out.println("C is greater");
    			}
    			
    		}
    	else {
    		if(b>c) {
    			System.out.println("B is greater");
    		}
    		else {
    			System.out.println("C is greater");
    		}
    		
    		
    		if(a>b && a>c) {
    			System.out.println("A is greater");
    		}
    		else if(b>c && b>a) {
    			System.out.println("B is greater");
    		}
    		else if(c>b && c>a) {
    			System.out.println("C is greater");
    		}
    	}
	}

}
