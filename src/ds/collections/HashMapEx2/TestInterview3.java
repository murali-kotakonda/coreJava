package ds.collections.HashMapEx2;

import java.util.HashMap;
import java.util.Map;

/**
  Map with Employee obj as key and Project obj as value.
  Map<Employee, Project> map = new HashMap<>();
	//employee obj is key
	//project obj is value
  
  - Add 4 entries;
  - get()
  - containsKey()
  - remove()
  - print all , use entrySet() method.
  

-If we need to keep obj as a key inside the map
then it is mandatory to provide
- equals()
- hashcode() methods inside the class.

As we are keeping Employee obj as key, so we need to write
equals() &  hashcode() methods inside Employee class.


Do we need to write equals() &  hashcode() methods  for Project class?
No


Do we need to write equals() &  hashcode() methods  for Employee class?
Yes

 */

public class TestInterview3 {
	public static void main(String[] args) {
		Map<Employee, Project> map = new HashMap<>();
		
		Employee e1 = new Employee("user1",1,"testpan1");
		Employee e2 = new Employee("user2",2,"testpan2");
		Employee e3 = new Employee("user3",3,"testpan3");
		
		Project p1 = new Project(12,"pro1");
		Project p2 = new Project(13,"pro2");
		Project p3 = new Project(14,"pro3");
		
		//keep the data in map
		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p3);
		
		System.out.println("*************Print size******************");
		System.out.println(map.size());
		
		System.out.println("**** Add e4  ****"); 
		Employee e4 = new Employee("user3",3, "testpan3"); // e4 is a duplicate of e3 
		Project p4 = new Project(1555,"pro555"); 
		map.put(e4, p4); // p3 is replaced with p4.
		
		
		/*
		 As e4 and e3 are duplicates , All opeartions 
		  get() , remove() ,containsKey() behaves same for e4 and e3.
		  
		*/
		
		System.out.println("*************Print size******************");
		System.out.println(map.size()); 
		
		System.out.println(map.get(e3));
	}
}

