package java8Features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5Count {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		//get count of empty string
		long count1 = strings
					.parallelStream()
					.filter(string -> string.isEmpty()).count();

		List<Product> products = new ArrayList<Product>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		
		// count number of products based on the filter
		System.out.println("******count of price <30000********");
		long count = products
				.stream()
				.filter(product -> product.price < 30000)
				.count();
		System.out.println(count);
	}
}