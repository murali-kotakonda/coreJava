package conditions;

import java.util.Scanner;

/**
 
Req:
Take cityName as input.

if cityName is "hyd"  => "Service provided"
if cityName is "bangalore"  => "Service provided"
if cityName is "chennai"  => "Service provided"
if cityName is "mumbai"  => "Service provided"

for any other city  => "service not provided" .


 */
public class Ex10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	//take id, userType , age as input
	System.out.println("enter city Name");
	String city = sc.next();
	
	if(city.equals("hyd")  || city.equals("bangalore")  || city.equals("chennai")  || city.equals("mumbai")  ) {
		System.out.println("service provided");
	}else {
		System.out.println("service not provided");
	}
	
}
}
