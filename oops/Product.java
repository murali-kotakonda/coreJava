package oops;

public class Product {

	String name;
	double cost;
	String brand;
	double discount;
	
	
	public Product(){
		System.out.println("0 arg constr");
	}
	
	public Product(String name, double cost, String brand, double discount) {
		this.name = name;
		this.cost = cost;
		this.brand = brand;
		this.discount = discount;
	}


	public void show(){
		System.out.println("*********hi******");
		System.out.println(name);
		System.out.println(cost);
		System.out.println(brand);
		System.out.println(discount);
	}
	
}
