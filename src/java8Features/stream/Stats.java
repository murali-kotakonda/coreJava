package java8Features.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Stats {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(8,10,289,0,23,14,67,98,54);

	IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

	System.out.println("Highest number in List : " + stats.getMax());
	System.out.println("Lowest number in List : " + stats.getMin());
	System.out.println("Sum of all numbers : " + stats.getSum());
	System.out.println("Average of all numbers : " + stats.getAverage());
}
}
