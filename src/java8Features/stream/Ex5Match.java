package java8Features.stream;

import java.util.ArrayList;
import java.util.List;

public class Ex5Match {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		boolean found = productsList.stream().anyMatch(p -> p.id == 1);
		if(found) {
			System.out.println("product found");
		}else {
			System.out.println("product not found");
		}

	}
}
