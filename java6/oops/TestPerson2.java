package oops;

import java.util.Scanner;

public class TestPerson2 {

	public static void main(String[] args) {
		// set data for two persons and print
		Person p1 = new Person();// p1 internally memory fo id,name,age ,aadhar

		System.out.println("enter values for p1 and p2");

		//take input from console and keep inside the object
		Scanner sc = new Scanner(System.in);
		// set data
		p1.id = sc.nextInt();
		p1.age = sc.nextInt();
		p1.name = sc.next();

		Person p2 = new Person();// p2 internally memoey fo id,name,age ,aadhar

		// set data
		p2.id = sc.nextInt();
		p2.age = sc.nextInt();
		p2.name = sc.next();

		// print data
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);

		System.out.println("********************************************");
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}
