package conditions;
 
import java.util.Scanner;
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
       
         if id is wrong, then dont check for age 
         if id is valid , then only check for age
         if age is wrong, then dont check for userType 
         if age is valid , then only check for userType
  
  
 solution:
 1.Nested if statements
 2.if and else if
 
 using Nested if statements
    
 */
public class Ex6 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id");
	int id = sc.nextInt();
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	
	System.out.println("Enter usertype");
	String usertype = sc.next();
	
	 //perform validations
	  
	  //id should be positive
	  if(id>0) {
		  System.out.println("valid id");
		  //  age should be greater than 18
		  if(age > 18) {
			  System.out.println("valid age");
			  //  usertype should be "admin"
			  if(usertype.equals("admin")) {
				  System.out.println("valid usertype");
			  }else {
				  System.out.println("invalid usertype");
			  }
		  }else {
			  System.out.println("invalid age");
		  }
	  }else {
		  System.out.println("invalid id");
	  }
}
}
