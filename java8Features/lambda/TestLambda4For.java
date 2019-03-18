package java8Features.lambda;

import java.util.*;

public class TestLambda4For {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("user1");
		list.add("user2");
		list.add("user3");
		list.add("user4");

		for(String n: list){
			System.out.println(n);
		}
		
		list.forEach((n) -> System.out.println(n));
	}
}
