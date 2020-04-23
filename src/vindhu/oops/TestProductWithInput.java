package vindhu.oops;

import java.util.Scanner;

public class TestProductWithInput {

	public static void main(String[] args) {
		Product p1 = getProduct();
		Product p2 = getProduct();
		Product p3 = getProduct();
		
		p1.show();
		p2.show();
		p3.show();
	}

	private static Product getProduct() {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("enter cost");
		double cost = sc.nextDouble();
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter brand");
		String brand=sc.next();
		
		System.out.println("enter discount");
		double discount=sc.nextDouble();
		
		Product  p = new Product(name, cost, brand, discount);
		return p;
	}
}