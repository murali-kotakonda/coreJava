package conditions;

import java.util.Scanner;

public class Ex9 {

	/**
	take cityname as input 
   if cityname is "hyd"  or "chennai" or "bangalore" or "mumbai" o/p=> service is provided
   if cityname is other than what is mentioned above o/p => servcie is not provided.
	 */
	public static void main(String[] args) {
		
		//take input for 3 nos
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city name");
		String city = sc.next();
		
		// ||  logicalor 
		//if block will execute if any one of the condition is satisfied
		if(city.equals("hyd") ||  city.equals("chennai") ||  city.equals("bangalore") 
				|| city.equals("mumbai")) {
			System.out.println("service is provided");
		}else {
			System.out.println("service is not provided");
		}
		 
 	}
}
