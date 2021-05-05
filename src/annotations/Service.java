package annotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Service extends Thread {

	@MethodInfo(author = "kumar", comments = "Main method", date = "Nov 17 2012", revision = 1)
	public String process() {
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@Override
	public String toString() {
		return "MethodInfoUse []";
	}
	
	public  void run() {
		System.out.println("start ");
	}
	public static void main(String[] args) {
		Map m = new HashMap<>();
		m.put(null, 1);
		m.put(3, 1);
		
		Set s = m.keySet();
		Iterator iterator = s.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List asList = Arrays.asList("aAaA","AaA","aAa","AAaa");
		Collections.sort(asList);
		System.out.println(asList);
		
	 boolean b1= false;
	 boolean b2= false;
	 System.out.println(20/10%2);
	new Service().run();
	 
	}

}

class A{
	int i;
	 
}
class B extends A{
  
	B(){
		
	}
	
	void man() {
		super.i =9;
	} 
	
}



