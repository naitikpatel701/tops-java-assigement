package Array;

public class Array_operation {
public static void main(String[] args) {
		
		int a[]= {10,45,68,64,45,98,12,36,98,12,70};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		System.out.println(sum/a.length);
	}

}
