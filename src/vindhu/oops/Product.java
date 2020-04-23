package vindhu.oops;

public class Product {
	String name;
	double cost;
	String brand;
	double discount;
	public Product() { // zero argument constructor
		
	}
	public Product(String name, double cost, String brand, double discount) {//parametrized constructor
		this.name = name;
		this.cost = cost;
		this.brand = brand;
		this.discount = discount;
	}
	public void show() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(brand);
		System.out.println(discount);
	}

}
//the show() function we can call any number of times.m