package enums;

import java.util.Scanner;


public class TestUserType {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("entr user type");
	String user = sc.next();
	
	UserType.values();//GET ALL objs
	System.out.println(UserType.ADMIN); // get specific object
	
	//get all objs and compare with input
	for(UserType  userType : UserType.values()){
		if(userType.name().equalsIgnoreCase(user)){
			System.out.println("valid user");
			break;
		}
	}
	System.out.println("exit");
	 
}
}
