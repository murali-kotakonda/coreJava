package ds.collections.HashMapEx2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMapStringEmployee {
public static void main(String[] args) {
	Map<String, Employee> map = prepareMap();

	Employee eObj1 = map.get("user3");
	System.out.println(eObj1);
	
	Employee eObj2 = map.get("user5");
	System.out.println(eObj2);
	
	map.put("user2", new Employee("user22",22,"pan22")); 
	Employee eObj3 = map.get("user2");
	System.out.println(eObj3);
	
	
	
	String name ="user3";
	System.out.println(map.get(name));
	System.out.println(map.containsKey(name));
	map.remove(name);
	System.out.println(map.get("user3"));

	
	
	
	
	
	
	
	
	
	
	
	
	for(Entry<String, Employee> entry : map.entrySet()){
			String key = entry.getKey();
			Employee emp = entry.getValue();
			System.out.println("key= "+key + " , value=" + emp);
	}
	
}




private static Map<String, Employee> prepareMap() {
	
	
	Map<String, Employee> map = new HashMap<>();
	
	Employee e1 = new Employee("user1",1,"pan1");
	Employee e2 = new Employee("user2",2,"pan2");
	Employee e3 = new Employee("user3",3,"pan3");
	Employee e4 = new Employee("user4",4,"pan4");
	
	
	//keep the data in map
	map.put("user1", e1);
	map.put("user2", e2);
	map.put("user3", e3);
	map.put("user4", e4);
	 
	return map;
}


}

