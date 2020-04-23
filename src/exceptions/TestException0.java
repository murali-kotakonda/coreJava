package exceptions;

import java.util.Scanner;
public class TestException0 {
	public static void main(String[] args) {
    //take age as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age= sc.next();
    
    //convert age string to int
		int  ageInt  = 0;
		try{
      //parseInt() has chances for exception 
			ageInt  = Integer.parseInt(age);
		}
		catch(NumberFormatException ex){
      //if exception occures then give meaning msg to customer
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
