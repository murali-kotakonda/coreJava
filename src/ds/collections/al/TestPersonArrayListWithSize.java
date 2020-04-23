package ds.collections.al;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class TestPersonArrayListWithSize {
	public static void main(String[] args) {
		// 1. input size
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		// 2. create string array
		List<Person> list = new ArrayList<Person>();

		
		for(int i=0;i<size;i++){
			
			System.out.println("Enter Details for Person:"+(i+1));

			// read the inputs
			System.out.println("Enter name:");
			String name = sc.next();

			System.out.println("Enter id:");
			int id = sc.nextInt();

			System.out.println("Enter age:");
			int age = sc.nextInt();

			// create obj and keep the input inside the obj
			Person person = new Person(id,name,age);
			
			list.add(person);
			
		} 

		for(Person p : list ){
			System.out.println(p.getId() + " , " +p.getName() + " , "+p.getAge());
		}
	}
}
