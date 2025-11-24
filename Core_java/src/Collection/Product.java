package Collection;

public class Product {
	
	int id;
	String name;
	double price;
	int contity;
	
	
	public Product(int id, String name, double price, int contity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.contity = contity;
	}
	
	public void display() {
		
		System.out.println(id+" "+name+" "+price+" "+contity);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", contity=" + contity + "]";
	}
	
	

}
