package ds.collections.HashMapEx2;

import java.util.HashMap;
import java.util.Map;

public class TestInterview2 {
	 	
	public static void main(String[] args) {
		//create map
		Map<String, String> map = new HashMap<>();
		
		// add one entry 
		//add variable1 in the map
		String str1 = "127";
		map.put(str1, "user5");
		System.out.println(map.get("127"));
		
		//create variable2  that has same value as variable1
		String str2 = "127";
		
		//perform all opeartions on str2
		System.out.println(map.get(str2)); 
		System.out.println(map.containsKey(str2));  
		//remove
	 
		map.remove(str2); //this will remove 127 + user5 from the map
		System.out.println(map.containsKey(str1)); //false
		System.out.println(map.size());// zero
	}
}

//Line 22: returns user5 : str1 And str2 are duplicates
//Line 23: returns true; str1 And str2 are duplicates
//Line 25  this will remove 127 + user5 from the map