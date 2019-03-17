package ds.collections.HashMapEx2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestHashMap {
public static void main(String[] args) {
	Map<Employee, Project> map = new HashMap<>();
	
	Employee e1 = new Employee("user1",1);
	Employee e2 = new Employee("user2",2);
	Employee e3 = new Employee("user3",3);
	
	Project p1 = new Project(12,"pro1");
	Project p2 = new Project(13,"pro2");
	Project p3 = new Project(14,"pro3");
	
	//keep the data in map
	map.put(e1, p1);
	map.put(e2, p2);
	map.put(e3, p3);
	
	
	
	System.out.println(map.get(e1));
	System.out.println(map.get(e2));
	System.out.println(map.get(e3));
	
	
	
	
	
	
	
	
	//1. create new obj ; and search in map
	Employee e4 = new Employee("user3",3);
	System.out.println(map.get(e4));
	System.out.println(map.containsKey(e4));
	
	map.remove(e4);
	System.out.println(map.get(e3));
	
	
	
	
	
	
	
	
	
	
	
	for(Entry<Employee, Project> entry :  map.entrySet()) {
		Employee e = entry.getKey();
		Project p = entry.getValue();
		
		System.out.println("key= "+e + " , value=" + p);
	}
	
	 
}
}

