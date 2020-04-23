package java8Features.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Stream API will allow sequential as well as parallel execution.
//best when working with Collections and usually with Big Data, we need to filter out them based on some conditions.
public class Ex5Sort {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(6, "Dell Laptop", 100000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));

		// Comparator<Product> comp = (e1, e2) -> e1.name.compareTo(e2.name);
		Comparator<Product> comp = (e1, e2) -> (e1.id - e2.id);
		List<Product> products = productsList.stream().sorted(comp).collect(Collectors.toList());

		products.forEach(p -> System.out.println(p));
	}
}
