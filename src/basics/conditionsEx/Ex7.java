package conditions;
 
/**
	1.Take input for
    id(int) , age(int) , usertype(string)
    
    2.perform validations
    - id should be positive
    - age should be greater than 18
    - usertype should be "admin"
    
    3. if id is correct then only validate the age
       if age is correct then only validate the usertype
       
       if id is incorrect stop prog immediately
       if age is incorrect stop prog immediately
       
 solution:
 1.Nested if statements
 2.if and else if
 
 using if and else if statements
   
 when should we prefer if and else if:
 -----------------------------------------
 1. when there is a dependency between two conditions
 2. at a time only one condition is satisfied
 3. simplified version for nested if statements
 */


import java.util.Scanner;

public class Ex7 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id");
	int id = sc.nextInt();
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	
	System.out.println("Enter usertype");
	String usertype = sc.next();
	
	
	if(id<0 ) {
		  System.out.println("invalid id");
	}else if(age < 18) {
		System.out.println("Id is valid");
		System.out.println("Age is invalid");
	}else if (!usertype.equals("admin")) {
		System.out.println("id is valid");
		System.out.println("age is valid");
		System.out.println("usertype is invalid");
	}else {
		System.out.println("id is valid");
		System.out.println("age is valid");
		System.out.println("usertype is valid");
	}
	
	
}
}
