package Imp_Classes;

public class String2 {
	public static void main(String[] args) {
		
		String str="Sun rises in EAst";
	
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('s'));
		System.out.println(str.lastIndexOf('s'));
		System.out.println(str.startsWith("S"));
		System.out.println(str.endsWith("r"));
		System.out.println(str.substring(5,8));
		System.out.println(str.replace("s","T"));
		System.out.println(str.trim());
		
		System.out.println("*********************");
		
		String words[]= str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
	
	}
		
		System.out.println("************************");
			
			char ch[]=str.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				System.out.println(ch[j]);
			
		}
	}

}
