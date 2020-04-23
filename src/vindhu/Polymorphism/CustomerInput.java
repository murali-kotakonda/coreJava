package vindhu.Polymorphism;

import java.util.Scanner;

public class CustomerInput {
	public  void input(Customer c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name:");
		c.fname=sc.next();
		System.out.println("enter last name:");
		c.lname=sc.next();
		System.out.println("enter email id:");
		c.email=sc.next();
		System.out.println("enter mobile number:");
		c.mobile=sc.next();
		System.out.println("enter city:");
		c.city=sc.next();
	}
}
