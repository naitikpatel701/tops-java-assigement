package OOPs;

interface Shape{
	
	double PI =3.14;
	public void area();
}

class Circle implements Shape{
	
	double r;
	
	public Circle(double r) {
		super();
		this .r=r;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area=PI*r*r;
		System.out.println("area of Circle is"+area);
	}
}

class Triangle implements Shape{
	
	double height;
	double base;
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area=0.5*base*height;
		System.out.println("area of triangle is :"+area);
	}
	
}

class Square implements Shape{
	
	double length;

	public Square(double length) {
		super();
		this.length = length;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
	    double area =length*length;
	    System.out.println("area of square is :"+area);
	}
}

public class Area_Finder {
        public static void main(String[] args) {
			
        	Shape c=new Circle(10);
        	c.area();
        	
        	Shape t=new Triangle(10,20);
        	t.area();
        	
        	Shape s=new Square(12);
        	s.area();
			}
		}

