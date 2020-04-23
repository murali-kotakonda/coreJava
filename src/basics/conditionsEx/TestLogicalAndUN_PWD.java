package basics.conditionsEx;

import java.util.Scanner;

public class TestLogicalAndUN_PWD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter User name:");
		String uname = sc.next();

		System.out.println("enter password:");
		String pwd = sc.next();
		 
		if(uname.equals("admin") && pwd.equals("admin")){
			System.out.println("login succes");
		}else{
			System.out.println("login failure");
		}
	
		if(!uname.equals("admin") || !pwd.equals("admin")){
			System.out.println("login failure");
		}else{
			System.out.println("login success");
		}
		
	
	}		
}
