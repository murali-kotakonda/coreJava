package conditions;
 
/**
    1.Take input for
    id(int) , age(int) , usertype(string)
    
    2.perform validations
    - id should be positive
    - age should be greater than 18
    - usertype should be "admin"
  
  If all 3 inputs are valid o/p=>Valid Data
  If any input is wrong o/p => Invalid Data
    
  solution:
  
   can we write multiple conditions in one if statement?
 --------------------------------------------------------
    Yes
    		  
  	ways?
--------------	  
  	&&  ->  block is executed if all conditions are satisfied
  	||  ->	block is executed if atleast one condition is satisfied  
  	
  	
 */
import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id");
	int id = sc.nextInt();
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	
	System.out.println("Enter usertype");
	String usertype = sc.next();
	
	//using &&
	if(id>0 && age>18 && usertype.equals("admin")) {
		System.out.println("valid data");
	}else {
		System.out.println("invalid data");
	}
	
	//using ||
	if(id<0  || age< 18 || !usertype.equals("admin")) {
		System.out.println("invalid data");
	}else {
		System.out.println("valid data");
	}
}}
