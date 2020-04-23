package enums;

import java.util.Scanner;


public class TestUserType2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("entr user type");
	String user = sc.next();
	
	boolean found = false;
	//get all objs and compare with input
	for(UserType  userType : UserType.values()){
		if(userType.name().equalsIgnoreCase(user)){
			found= true;
			break;
		}
	}
	if(found) {
		System.out.println("valid user");
	}else {
		System.out.println("invalid user");
	}
	System.out.println("exit");
	 
}
}
