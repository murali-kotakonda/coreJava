package conditions;

import java.util.Scanner;

/**
 
 take loginname and password as input.
 
 if loginname value is "admin" and 
 password value is "admin" =================> login success
 for any other values  =====================> login failure.
 
- can we write multiple conditions in one if statement?
  YES
  
possible options:
-----------------
&&   -> logical and  
||   -> logical or


logical and &&:
-----------------
if multiple conditions are joined using && , then the if block is executed only if all conditions are satisfied.


logical || OR:
-----------------
if multiple conditions are joined using OR , then the if block is executed if ATLEAST One condition is satisfied.


 */
public class Ex8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	//take id, userType , age as input
	
	System.out.println("Enter login name");
	String loginName = sc.next();
	
	System.out.println("Enter password");
	String password = sc.next();
	
	
	 if(loginName.equals("admin") && password.equals("admin")) {
		 System.out.println("login success");
	 }else {
		 System.out.println("logoin failure");
	 }
	
}
}
