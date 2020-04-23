package java8Features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		products.add(new Product(6, "Dell Laptop", 100000f));
		
		System.out.println("****************any product whose price is less thean 10k*******************");
		boolean found = products.stream().anyMatch(p -> p.price == 10000);
		if(found) {
			System.out.println("product found");
		}else {
			System.out.println("product not found");
		}

		System.out.println("*********get single dell instance 1*************");
		Product pro = products.stream()
			      .filter(e -> e.name.equals("Dell Laptop"))
			      .findFirst()
			      .orElse(null);
		System.out.println(pro);
		
		System.out.println("*********get single dell instance 2*************");
		
		pro = products.stream()
			      .filter(e -> e.name.equals("Dell"))
			      .findFirst()
			      .orElse(null);
		System.out.println(pro);
	}
}
