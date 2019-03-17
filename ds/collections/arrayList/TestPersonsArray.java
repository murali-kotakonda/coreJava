package ds.collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPersonsArray {
public static void main(String[] args) {
	
	List<Person> persons = new ArrayList<Person>();
	Scanner sc = new Scanner(System.in);
	//input string till 'END' is encountered
	//3. input the names 
	int id= 1000;
	System.out.println("Enter person names and type END to stop :");
	while(true){
		System.out.println("Enter name :");
		String name = sc.next();
		
		if("END".equals(name)){
			break;
		}
		
		System.out.println("Enter age :");
		int age = sc.nextInt();
		
		Person per = new Person(id++, name, age);
		persons.add(per);
	}		
	
	System.out.println("Entered persons ARE :");
	
	for(Person p : persons){
		System.out.println(p);
	}
	
} 
}
