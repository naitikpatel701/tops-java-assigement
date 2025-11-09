package Array;

public class Array_sum {
public static void main(String[] args) {
		
		int a[][]= {{5,6,7},{7,8,9},{10,11,12}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*****************");
		int b[][]= {{4,5,6},{7,8,9},{3,4,5}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				
				System.out.println(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
}
}
