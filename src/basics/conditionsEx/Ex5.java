package conditions;
 
import java.util.Scanner;
/**
	1.Take input for
    id(int) , age(int) , usertype(string)
    
    2.perform validations
    - id should be positive
    - age should be greater than 18
    - usertype should be "admin"
    
    o/p:
    
    1) 1000 23 admin
       valid id            
       valid age
       valid usertype
    
       
    2) -20 23 admin
       invalid id
       valid age
       valid usertype
 */
public class Ex5 {
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
	  }else {
		  System.out.println("invalid id");
	  }
	
	  //  age should be greater than 18
	  if(age > 18) {
		  System.out.println("valid age");
	  }else {
		  System.out.println("invalid age");
	  }
	  
	  //  usertype should be "admin"
	  if(usertype.equals("admin")) {
		  System.out.println("valid usertype");
	  }else {
		  System.out.println("invalid usertype");
	  }
}
}



