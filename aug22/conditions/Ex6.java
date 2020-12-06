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

solution: if and else if  

when should we use if and else if  ?

-> we have multi conditionsand dependency between the conditions
-> at a time only one condition is satisfied.
-> simplifies the nested -if 

 */
public class Ex6 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	//take id, userType , age as input
	
	System.out.println("enter id");
	int id = sc.nextInt();
	
	
	System.out.println("enter userType");
	String userType = sc.next();
	
	
	System.out.println("enter age");
	int age = sc.nextInt();
	
	
		if (id < 0) {
			// id is invalid
			System.out.println("invalid id");
		} else if (!userType.equals("admin")) {
			//id is valid, but userType is invalid
			System.out.println("id is valid");
			System.out.println("invalid userType");
		} else if (age < 18) {
			//id is valid, userType is valid, but age is invalid
			System.out.println("id is valid");
			System.out.println("userType is valid");
			System.out.println("invalid age");
		} else {
			//id is valid, userType is valid, age is valid
			System.out.println("id is valid");
			System.out.println("userType is valid");
			System.out.println("age is valid");
		}
	
}
}
