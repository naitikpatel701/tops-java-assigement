package Imp_Classes;

public class String1 {
	public static void main(String[] args) {
		
		String s1="Java";
		String s2="Php";
		String s3="Java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		System.out.println("****************");
		
		String str1= new String("Java");
		String str2= new String("Php");
		String Str3 =new String("Java");
	
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(Str3));
		System.out.println(str1 == Str3);
	}

}
