package vindhu.Polymorphism;
import java.util.Scanner;
public class TestCustomer {
	public static void main(String[] args) {
		Customer c=new Customer();
		input(c);
		boolean result=validation(c);
		if(result) {
		save(c);
		}
	}
	public static void input(Customer c) {
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
	public static boolean validation(Customer c) {
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
		public static void save(Customer c) {
			System.out.println(c.fname);
			System.out.println(c.lname);
			System.out.println(c.mobile);
			System.out.println(c.email);
			System.out.println(c.city);
			
		}
}
