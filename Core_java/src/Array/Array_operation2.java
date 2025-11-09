package Array;

public class Array_operation2 {
public static void main(String[] args) {
		
		int a[]= {10,45,68,64,45,98,12,36,98,12,70};
		int max=a[0];
		int smax=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max) {
				
				smax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);
	}

}
