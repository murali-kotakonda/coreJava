package java8Features.lambdaAndForEach;

import java.util.*;

//remove if the name starts with user1
//solution: use removeIf method

public class TestForEach3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("user1");
		list.add("user2");
		list.add("user3");
		list.add("user4");
		list.add("user11");
		list.add("user21");
		list.add("user33");
		
		System.out.println("*******Before removal********");
		list.forEach(str -> System.out.println(str));
		
		list.removeIf( str  -> str.startsWith("user1"));
		
		System.out.println("*******after removal********");
		list.forEach(str -> System.out.println(str));
	}
}
