package generics;

import java.util.List;

public class UpperBound3 {

	class Person{
		
	}
	
	public static double print(List<? extends Person> list){
		double sum = 0;
		for(Person n : list){
			System.out.println(n);
		}
		return sum;
	}
}
