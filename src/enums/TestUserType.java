package enums;

public class TestUserType {
public static void main(String[] args) {
	System.out.println(UserType.ADMIN); // get specific object
	System.out.println(UserType.AGENT);
	
	UserType u = UserType.ADMIN;
	System.out.println("Admin obj = "+u.name());
	
	
	System.out.println("*****************display all allowed  usertypes*********************");
	//get all objs and compare with input
	for(UserType  userType : UserType.values()){
			System.out.println(userType);
	}
	 
}
}
