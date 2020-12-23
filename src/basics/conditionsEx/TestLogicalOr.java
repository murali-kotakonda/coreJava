package basics.conditionsEx;

import java.util.Scanner;

public class TestLogicalOr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		String citi = sc.next();

		if (citi.equals("hyderabad")) {
			System.out.println("Service can be Provided");
		} else if (citi.equals("bangalore")) {
			System.out.println("Service can be Provided");
		} else if (citi.equals("chennai")) {
			System.out.println("Service can be Provided");
		} else if (citi.equals("mumbai")) {
			System.out.println("Service can be Provided");
		} else {
			System.out.println("service cannot be provided");
		}
	}
	
	 public static void main2(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("enter city name");
	        String cityname = sc.next();

	        switch (cityname) {
	            case "hyd":
	                System.out.println("service is provided");
	                break;
	            case "chennai":
	                System.out.println("service is provided");
	                break;
	            case "bangalore":
	                System.out.println("service is provided");
	                break;
	            case "mumbai":
	                System.out.println("service is provided");
	                break;
	            default:
	                System.out.println("service is not provided");
	                break;
	        }

	    }
}
