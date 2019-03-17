package exceptions;

import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age= sc.next();
		int  ageInt  = 0;
		try{
			ageInt  = Integer.parseInt(age);
		}
		catch(Exception ex){
			System.out.println("invalid input ::"+age+". " +
					"please try again");
		}
		finally{
			System.out.println("in finally");
		}
		System.out.println("after conversion age int :: "+ageInt);
		System.out.println("exit");
		
		
	}
}
