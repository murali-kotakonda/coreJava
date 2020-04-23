package vindhu.oops;
import java.util.Scanner;
public class TestPersonDetailsWithInput {

	public static void main(String[] args) {
		System.out.println("Enter the no.of addresses the person have");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PersonDetails p=new PersonDetails("abc","xyz","male");
		if(n==1)
		{
			PersonDetails p1 = getAddress();
			p.showDetails();
			p1.showAddress();
		}
		if(n==2)
		{
			System.out.println("Enter the details of address 1:");
			PersonDetails p1 = getAddress();
			System.out.println("Enter the details of address 2:");
			PersonDetails p2 = getAddress();
			p.showDetails();
			p1.showAddress();
			p2.showAddress();
		}
		if(n==3)
		{
			System.out.println("Enter the details of address 1:");
			PersonDetails p1 = getAddress();
			System.out.println("Enter the details of address 2:");
			PersonDetails p2 = getAddress();
			System.out.println("Enter the details of address 3:");
			PersonDetails p3 = getAddress();
			p.showDetails();
			p1.showAddress();
			p2.showAddress();
			p3.showAddress();
		}
	}

	private static PersonDetails getAddress() {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("enter houseno");
		String houseno=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter state");
		String state=sc.next();
		System.out.println("enter country");
		String country=sc.next();
		System.out.println("enter pincode");
		long pincode=sc.nextLong();
		PersonDetails p=new PersonDetails(houseno,city,state,country,pincode);
		return p;
		
	}
}
