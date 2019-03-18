package java8Features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//Stream API will allow sequential as well as parallel execution.
		//best when working with Collections and usually with Big Data, we need to filter out them based on some conditions.
public class Ex5Dispaly {
		public static void main(String[] args) {
			
			List<Integer> myList = new ArrayList<>();
			for(int i=0; i<100; i++) myList.add(i);
			
			//sequential stream
			myList.stream().filter(p -> p > 90)
			.forEach(p -> System.out.println("High Nums sequnce="+p));
			
			//using lambda with Stream API, filter example
			myList.parallelStream().filter(p -> p > 90)
			.forEach(p -> System.out.println("High Nums parallel="+p));

		}

}
