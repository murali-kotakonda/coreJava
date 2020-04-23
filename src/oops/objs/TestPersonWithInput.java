package oops.objs;

import java.util.Scanner;

public class TestPersonWithInput {
	public static void main(String[] args) {
		Person p = new Person();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter id");
		// assign values
		p.id = sc.nextInt();

		System.out.println("enter name");
		p.name = sc.next();

		System.out.println("enter age");
		p.age = sc.nextInt();

		// access values

		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);

		// access values
		// p.display();
	}
}
