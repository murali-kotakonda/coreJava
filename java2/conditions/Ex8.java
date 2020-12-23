package conditions;

import java.util.Scanner;


/*
take id (int), age(int) , userType(str) as input.
perform validation

if id is positive then print valid id else print invalid id
if age is gt 18  then print valid age else print invalid age
if userType value is "admin" then print valid userType else print invalid userType

if id is valid then only validate the age
if age is valid then only validate the usertype.
 
 
 solution:
 ->Nested If
 ->if and else if
 at a time only one block is executed
 if(){
 
 }else if(){
 
 }else if(){
 
 }else{
 
 }
*/
public class Ex8 {
	
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
		if(id < 0) {
			System.out.println("invalid id");
		}
		else if(age < 18) {
			System.out.println("id is valid");
			System.out.println("invalid age");
		}
		else if (!userType.equals("admin")) {
			System.out.println("id is valid");
			System.out.println("age is valid");
			System.out.println("invalid userType");
		}else {
			System.out.println("id is valid");
			System.out.println("age is valid");
			System.out.println("userType is valid");
		}
		/*
		  when should we use if + else if::
		  - there is a dependency between the conditions
		  - at a time only one condition is satisfied
		   
		 * */
	}
	
}




