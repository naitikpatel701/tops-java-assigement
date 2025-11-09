package Array;

public class Array_multipulcation {
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
		System.out.println("=============");
		int c[][]=new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3;k ++) {
					 c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
