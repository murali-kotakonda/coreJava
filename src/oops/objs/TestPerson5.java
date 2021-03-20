package oops;

import java.util.Scanner;

/**
Requirement to capture id,name,age for <count> persons.
Req: 
take input for size

you need to take input for (id,name, age) for size number of times
and display data

*/
public class TestPerson4 {

	public static void main(String[] args) {
		// create the object
		Person p1 = new Person();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of persons: ");
		int size = sc.nextInt();
		
		for (int i = 1; i <= size; i++) {
			// set the data
			System.out.println("enter id");
			p1.id = sc.nextInt();

			System.out.println("enter name");
			p1.name = sc.next();

			System.out.println("enter age");
			p1.age = sc.nextInt();

			System.out.println("********showing data for Person "+i +" ********");
			// display the data
			System.out.println(p1.id);
			System.out.println(p1.name);
			System.out.println(p1.age);
		}

		

	}
}