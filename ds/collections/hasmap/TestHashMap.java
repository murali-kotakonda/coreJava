package ds.collections.hasmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestHashMap {
public static void main(String[] args) {
	Map<String, Person> map = new TreeMap<>();
	
	//CREATING OBJECTS
	Person p1 = new Person(12, "user1", 25);
	Person p2 = new Person(13, "user2", 26);
	Person p3 = new Person(14, "user3", 27);
	Person p4 = new Person(15, "user4", 28);
	Person p5 = new Person(16, "user5", 28);
	Person p6 = new Person(16, "user6", 28);
	Person p7 = new Person(19, "user6", 29);
	
	
	//store objs in map

	map.put("user3", p3);
	map.put("user1", p1);
	map.put("user6", p6);
	map.put("user4", p4);
	map.put("user5", p5);
	map.put("user2", p2);
	
	System.out.println(map.size());

	
	//read by key (user name)
	String input = "user3";
	Person person = map.get(input);
	System.out.println(person);
	
	map.put("user6", p7);
	Person person2 = map.get("user6");
	System.out.println(person2);

	
	//iterate map
	for(Entry<String, Person> entry:  map.entrySet()){
		System.out.println(entry.getKey()+ "---" + entry.getValue());
	}
}
}
