package java8Features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		// Using Collectors's method to sum the prices.
		
		System.out.println("******************final sum *******************");
		double totalPrice3 = 
				products.stream()
				.collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);

	}
}
