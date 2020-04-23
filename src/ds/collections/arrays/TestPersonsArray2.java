package ds.collections.arrays;

import java.util.Scanner;

public class TestPersonsArray2 {
	public static void main(String[] args) {

		Person[] persons = new Person[4];

		//insert 
		Person p1 = new Person(1000, "user1");
		persons[0] = p1;
		
		Person p2 = new Person(1001, "user2");
		persons[1] = p2;

		Person p3 = new Person(1002, "user3");
		persons[2] = p3;
		
		Person p4 = new Person(1003, "user4");
		persons[3] = p4;
		
		//read all
		System.out.println("--- displaying using enhancd for loop----");
		for (Person p : persons) {
				System.out.println(p.id + " " + p.name);
		}

	}
}
