package java8Features.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Stream API will allow sequential as well as parallel execution.
//best when working with Collections and usually with Big Data, we need to filter out them based on some conditions.
public class Ex5Parallel {
	public static void main(String[] args) {
		// Ex1
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i <= 500; i++)
			myList.add(i);

		System.out.println("*******process sequential**********");
		myList.stream().filter(p -> p%2==0).forEach(p -> System.out.println("Even = " + p));

		System.out.println("*******process parallel**********");
		myList.parallelStream().filter(p -> p%2==0).forEach(p -> System.out.println("Even = " + p));

	}

}
