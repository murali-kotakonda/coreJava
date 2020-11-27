package conditions;

import java.util.Scanner;

public class Ex11 {
	/**
	   take username and passsword as input
	   if username valus is "admin" and password value is "admin" print login success
	   else print login failure
	 */
	public static void main(String[] args) {
		//take input for 3 nos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter username");
		String username= sc.next();
		
		System.out.println("enter password");
		String password= sc.next();
		 
		if(username.equals("admin") && password.equals("admin")) {
			System.out.println("login success");
		}else {
			System.out.println("login failure");
		}
 	}
}
