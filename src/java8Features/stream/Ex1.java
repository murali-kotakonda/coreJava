package java8Features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex1 {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		
		List<String> productNames = new ArrayList<String>();
		//approach1
		for (Product p : products) {
			// filtering data of list
			if (p.price < 30000) {
				productNames.add(p.name); // adding name to a productNames
			}
		}
			
		System.out.println(productNames); // displaying data

		Set<String> names = products.stream()
		.filter( p -> p.price < 30000)
		.map(p -> p.name)
		.collect(Collectors.toSet());
		System.out.println(names);
		
	}
}
