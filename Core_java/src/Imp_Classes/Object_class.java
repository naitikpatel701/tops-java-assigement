package Imp_Classes;

class A {

	int id = 10;

	@Override
	public String toString() {

		return "hello" + id;
	}
}

public class Object_class {
	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.getClass());

		System.out.println(a);
	}
}