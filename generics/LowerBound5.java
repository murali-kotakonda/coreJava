package generics;

import java.util.List;

public class LowerBound5 {

	public static void addIntegers(List<? super Integer> list){
		list.add(new Integer(50));
	}
}


