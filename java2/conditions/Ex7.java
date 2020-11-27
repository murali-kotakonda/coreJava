package conditions;

import java.util.Scanner;

/**
 * @author I335484
        
//assignment
//take id (int), age(int) , userType(str) as input.

//perform validation
//if id is positive then print valid id else print invalid id
//if age is gt 18  then print valid age else print invalid age
//if userType value is "admin" then print valid userType else print invalid userType
	
//if id is valid then only validate the age
//if age is valid then only validate the usertype.	
		
 */
public class Ex7 {
	
	public static void main(String[] args) {
		//take id (int), age(int) , userType(str) as input.
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter id");
		int id  = sc.nextInt();
		
		System.out.println("enter age");
		int age = sc.nextInt();
		
		System.out.println(" enter usertype");
		String userType = sc.next();
		//nested if statements ; if inside a if
		
		// if id is positive then print valid id else print invalid id
		if(id > 0) {
			System.out.println("valid id");
			// if age is gt 18  then print valid age else print invalid age
			if(age > 18) {
				System.out.println("valid age");
				// if userType value is "admin" then print valid userType else print invalid userType
				if(userType.equals("admin")) {
					System.out.println("valid userType");
				}else {
					System.out.println("invalid userType");
				}
			}else {
				System.out.println("invalid age");
			}
		}else {
			System.out.println("invalid id");
		}
	}
	
}




