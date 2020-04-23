package basics.conditionsEx;

import java.util.Scanner;

public class Ex70 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age:");
		int age = sc.nextInt();

		System.out.println("enter id");
		int id = sc.nextInt();

		System.out.println("enter usertype");
		String userType = sc.next();

		if(id>0) {
			System.out.println("valid id");
		}
		else {
			System.out.println("invalid id");
		}
		
		if(age>18){
			System.out.println("valid age");
		}else {
			System.out.println("invalid age");
		}
		
		if(userType.equals("admin")) {
					System.out.println("valid data");
		}else {
					System.out.println("invalid usertype");
		}
	}
}
