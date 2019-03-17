package generics.method;

import java.util.List;

public class GenericMethod2 {

	public static <T> T addAndReturn(T element, List<T> collection){
	    collection.add(element);
	    return element;
	}
}
