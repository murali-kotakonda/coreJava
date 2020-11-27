package conditions;

import java.util.Scanner;

public class Ex10 {

	/**
	   take id, usertype , age as input
	   if all 3 are valid print valid data
	   if any one of the data is wrong invalid data
	   
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enyer id");
		int id = sc.nextInt();

		System.out.println("enter usertype");
		String ut = sc.next();

		System.out.println("enter age");
		int age = sc.nextInt();
		
		//&& logical and
		// if block is executed only if all the conditions are satisfied.
		if(id>0  && age> 18 && ut.equals("admin")) {
			System.out.println("valid data");
		}else {
			System.out.println("invaid data");
		}
		 
 	}
}
