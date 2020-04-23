package oops.objs;

import java.util.Scanner;

public class CustomerTest3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter no of customers");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			// create customer obj
			Customer c = new Customer();

			// set the data for customer obj
			System.out.println("enter first name:");
			c.fname = sc.next();
			System.out.println("enter last name:");
			c.lname = sc.next();
			System.out.println("enter email id:");
			c.email = sc.next();
			System.out.println("enter mobile number:");
			c.mobile = sc.next();
			System.out.println("enter city:");
			c.city = sc.next();

			// print the data
			System.out.println(c.fname);
			System.out.println(c.lname);
			System.out.println(c.mobile);
			System.out.println(c.email);
			System.out.println(c.city);

		}

	}

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
	public  boolean validation(Customer c) {
		boolean result=true;
		if(!c.city.equals("hyderabad")&&!c.city.equals("banglore")&&!c.city.equals("chennai"))
		{
			System.out.println("invalid city");
			result=false;
		}
		else if(c.mobile.length()!=10) {
			System.out.println("invalid mobile number");
			result=false;
		}
		else {
			for(int i=0;i<c.email.length();i++) {
				if(c.email.charAt(i)=='@') {
					for(int j=i+1;j<c.email.length();j++)
					{
						if(c.email.charAt(j)!='.') {
							result=false;
						}
					}
				}
			}
			if(result==false) {
				System.out.println("invalid email id");
			}
		}
		return result;
	}
		public void save(Customer c) {
			System.out.println(c.fname);
			System.out.println(c.lname);
			System.out.println(c.mobile);
			System.out.println(c.email);
			System.out.println(c.city);
			
		}
}
