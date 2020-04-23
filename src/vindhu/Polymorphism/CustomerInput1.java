package vindhu.Polymorphism;

import java.util.Scanner;

public class CustomerInput1 {
	public  void input(Customer1 c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name:");
		c.setFname(sc.next());
		System.out.println("enter last name:");
		c.setLname(sc.next());
		System.out.println("enter email id:");
		c.setEmail(sc.next());
		System.out.println("enter mobile number:");
		c.setMobile(sc.next());
		System.out.println("enter city:");
		c.setCity(sc.next());
	}
}
