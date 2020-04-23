package java8Features.lambda;

import java.util.*;

public class TestLambda4For {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("user1");
		list.add("user2");
		list.add("user3");
		list.add("user4");
		list.add("user11");
		list.add("user21");
		list.add("user33");

		// old style
		for (String n : list) {
			System.out.println(n.toUpperCase());
		}

		// new style
		// new style
		list.forEach((String d) -> {
			System.out.println(d);
		});
		list.forEach((d) -> {
			System.out.println(d);
		});
		list.forEach((d) -> System.out.println(d));

		list.forEach((d) -> 
		{System.out.println(d.toUpperCase());});
		list.removeIf((a) -> a.startsWith("user1"));
		System.out.println("after removing starts with user1");
		list.forEach((d) -> System.out.println(d));

		System.out.println("*******print all*******");
		list.forEach((n) -> System.out.println(n));
		System.out.println("*********print in uppper case*****");
		list.forEach((n) -> System.out.println(n.toUpperCase()));

		System.out.println("after removing");
		list.removeIf(n -> n.startsWith("user1"));
		list.forEach((n) -> System.out.println(n));
	}
}
