package basics.conditionsEx;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = sc.nextInt();
		
		System.out.println("enter age:");
		int age = sc.nextInt();
		
		System.out.println("enter usertype");
		String userType = sc.next();

		if(id<0) {
			System.out.println("invalid id");
		}else if(age<18) {
			System.out.println("invalid age");
		}else if(!userType.equals("admin")) {
			System.out.println("invalid usertype");
		}else {
			System.out.println("valid data");
		}
	}
}
