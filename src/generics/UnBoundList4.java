package generics;

import java.util.List;
//Java Generics Unbounded Wildcard
public class UnBoundList4 {

	public static void printData(List<?> list){
		for(Object obj : list){
			System.out.print(obj + "::");
		}
	}
}
