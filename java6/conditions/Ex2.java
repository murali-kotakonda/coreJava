package conditions;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//1. take id, usertype , age as input
		//2. if id is valid then only validate usertype..
		//3.if  usertype is valid then only validate age
		
		
		//1. take id, usertype , age as input
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("enyer id");
		int id = sc.nextInt();
		
		System.out.println("enter usertype");
		String ut = sc.next();
		
		System.out.println("enter age");
		int age = sc.nextInt();
		
		if(id>0) {
			System.out.println("id is valid");
			
			if(ut.equals("admin")) {
				System.out.println("valid user type");
				
				if(age>18) {
					System.out.println("valid age");
					
				}else {
					
					System.out.println("invalid age");
					
				}
				
			}else {
				
				System.out.println("invalid useretype");
				
			}
			
			
		}else {
			
			System.out.println("id is invalid");
			
		}
		
	}
	
}
