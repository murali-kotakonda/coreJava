package conditions;

import java.util.Scanner;

/**
 
Req:
take id, userType , age as input
perform the validation

Rules:
--------------
->if id is positive , print "valid id" , if not print "invalid id"
->userType value is "admin",  print "valid usertype" , if not print "invalid usertype"
->if age is than 18  print "valid age" , if not print "invalid age"


If id is valid then validate the userType.
if userType is valid  then validate the age.

solution: nested if statement . [ if condition inside another if condition ]
 */
public class Ex5 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	//take id, userType , age as input
	
	System.out.println("enter id");
	int id = sc.nextInt();
	
	
	System.out.println("enter userType");
	String userType = sc.next();
	
	
	System.out.println("enter age");
	int age = sc.nextInt();
	
	
		if (id > 0) {
			System.out.println("valid id");

			if (userType.equals("admin")) {
				System.out.println("valid userType");

				if (age >= 18) {
					System.out.println("valid age");
				} else {
					System.out.println("invalid age");
				}

			} else {
				System.out.println("invalid userType");
			}

		} else {
			System.out.println("invalid id");
		}
	
}
}
