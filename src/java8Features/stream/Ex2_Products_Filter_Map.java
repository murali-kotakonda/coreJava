package java8Features.stream;

import java.util.ArrayList;
import java.util.List;
import org.omg.Messaging.SyncScopeHelper;

public class Ex2_Products_Filter_Map {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data

		System.out.println("***************print names whose price<30000*************************");
		products.stream().filter(p -> p.price == 30000).forEach(p -> System.out.println(p.name));

		// print all product names
		products.stream().forEach(p -> System.out.println(p.name));
		products.forEach(p -> System.out.println(p.name));

		// print whose price==3000
		System.out.println("*********print name whose price==3000*************");
		add(20, 20L);
	}

	public static void add(Integer a, Long b) {

	}

	public static void add(Long a, Integer b) {

	}
}
