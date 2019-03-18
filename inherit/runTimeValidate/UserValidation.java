package inherit.runTimeValidate;

import java.util.Scanner;

public class UserValidation extends CustomerValidation {
	Scanner sc=new Scanner(System.in);
	String s1="IN";
	String s2="V_"; 
	public void input(User u) {
		super.input(u);
		System.out.println("enter aadhar:");
		u.aadhar=sc.next();
		System.out.println("enter voterid:");
		u.voterid=sc.next();
	}
	public  boolean validation(User u) {
		boolean result=super.validation(u);
		if(result) {
			if(!u.aadhar.startsWith(s1)) {
				System.out.println("invalid aadhar");
				result=false;
			}
			else if(!u.voterid.startsWith(s2)) {
					System.out.println("invalid voterid");
					result=false;
			}
		}
		return result;
	}
	public void save(User u) {
		super.save(u);
		System.out.println(u.aadhar);
		System.out.println(u.voterid);
	}
}
