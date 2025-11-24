package assignment;

public class Matrix_Additionandsubtration {
	public static void main(String[] args) {
		
		int a[][]= {{4,5},{7,8}};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
		int b[][]= {{9,8},{6,5}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.println(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.println(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				
			System.out.println(a[i][j]-b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
