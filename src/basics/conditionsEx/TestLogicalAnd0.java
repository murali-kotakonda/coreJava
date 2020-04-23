package basics.conditionsEx;

import java.util.Scanner;

public class TestLogicalAnd0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = sc.nextInt();
		
		System.out.println("enter age:");
		int age = sc.nextInt();
		
		
		System.out.println("enter usertype");
		String userType = sc.next();
		
		/*if(id>0) {
			if(age>18) {
				if(userType.equals("admin")) {
					System.out.println("valid data");
				}else {
					System.out.println("invalid data");
				}
			}else {
				System.out.println("invalid data");
			}
		}else {
			System.out.println("invalid data");
		}*/
		
		
		if(id >0  && age >18 && userType.equals("admin")) {
			System.out.println("valid data");
		}else {
			System.out.println("invalid data");
		}
		
		
		if(id <=0  ||  age <18 || !userType.equals("admin")) {
			System.out.println("invalid data");
		}else {
			System.out.println("valid data");
		}
		
	}
	
}
