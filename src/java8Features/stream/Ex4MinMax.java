package java8Features.stream;

import java.util.ArrayList;
import java.util.List;

public class Ex4MinMax {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		
		System.out.println("******print max price**********");
		Product p = products
		.stream()
		.max( (p1,p2) -> (int)(p1.price - p2.price))
		.get();
		System.out.println(p);
		
		
		System.out.println("******print mini price**********");
		// min() method to get min Product price
		Product productB = products.stream().
				min((product1, product2) 
						-> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productB.name);
	}
}
