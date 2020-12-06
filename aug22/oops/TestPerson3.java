package oops;

import java.util.Scanner;

/**
Req: 
create one person obj
set data by taking input from console 
and display data

*/
public class TestPerson3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//create the obj
		Person p1 = new Person();
		
		//set the data
		System.out.println("enter id");
		p1.id=sc.nextInt();
		
		System.out.println("enter age");
		p1.age=sc.nextInt();
		
		System.out.println("enter name");
		p1.name =sc.next();
		
		//show data
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);
		
	}
}
