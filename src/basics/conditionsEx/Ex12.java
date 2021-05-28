package conditions;
 
/**
1.Take input for username and password
 if username value ="admin" and password value ="admin" then print ==> "login success"   
 if not print  => "login failure"  
 */
import java.util.Scanner;

public class Ex12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the username ");
	String userName = sc.next();
	
	System.out.println("Enter the password ");
	String password = sc.next();
	
	
	if(userName.equals("admin") && password.equals("admin")) {
		System.out.println("login success");
	}else {
		System.out.println("login failure");
	}
	
	if(!userName.equals("admin") ||  !password.equals("admin")) {
		System.out.println("login failure");
	}else {
		System.out.println("login success");
	}
	
	
}}

