package ds.collections.HashMapEx2;

import java.util.HashMap;
import java.util.Map;

public class TestInterview1 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("128", "user1");
		map.put("133", "user7");

		// get the size
		System.out.println(map.size());
		System.out.println(map.get("128"));
		System.out.println(map.get("133"));
		System.out.println(map.get("133"));
		System.out.println(map.get("500"));
		
		System.out.println("********** Add dupliacte key ***********");
		map.put("128", "user111");  
		map.put("131", "user44");  
		
		// get the size
		System.out.println(map.size());  // 
		System.out.println(map.get("128")) ;  //  
	}
}

//user1 is replaced with user111
/**

Till line 18
--------------------
128- user1
133- user7
131 - user44

after line 20
---------------------
128- user111
133- user7
131 - user44

 

*/
//dupliate KEY IS NOT ALLowed,
// user1 is replaced with user111

// when same key is added, then the value will be replaced.
//In Map Key is always unique; duplicate keys are not allowed.