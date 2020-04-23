package enums;

import java.util.Scanner;

public class Person {
 
	enum UserType {
		ADMIN,
		AGENT,
		CUSTOMER;
	}
 
	
	
	LoanType loanType;
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entr user type");
		String user = sc.next();
		
		for(UserType  userType : UserType.values()){
			if(userType.name().equalsIgnoreCase(user)){
				System.out.println("match found");
				break;
			}
		}
	}
 
}
