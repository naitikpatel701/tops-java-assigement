package Array;

public class Array_operation1 {
public static void main(String[] args) {
		
		int a[]= {10,45,68,64,45,98,12,36,98,12,70};
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
			System.out.println(max);
			System.out.println(min);
	}


}
