package A010_InterfaceAbstract;

import A011_PackageAccessModifiers.A028_Access;

public class Access_Demo extends  A028_Access{
	
	public void show() {
		
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		A028_Access ac=new A028_Access();
		ac.disp();
	}

}
