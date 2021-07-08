package conditions;
 
/**
  take cityname as input 
   
   if cityname is "hyderabad"  or "chennai" or "bangalore" or "mumbai" 
   o/p=> service is provided
   
   if cityname is other than what is mentioned above 
   o/p => service is not provided. 
   
   solutions:
   1.if and else if
   2.switch
   3.logical or
 */
import java.util.Scanner;

public class Ex13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the cityname ");
	String city = sc.next();
	
	if(city.equals("hyderabad")  || city.equals("mumbai")  ||city.equals("chennai") || 
			city.equals("bangalore") ) {
		System.out.println("service provided.");
	} else {
		System.out.println("Service not provided.");
	}
	
}
}




/*     
	//approach2
	switch(city) {
		case "hyderabad" : System.out.println("service is provided"); break;
		case "chennai" : System.out.println("service is provided"); break;
		case "bangalore" : System.out.println("service is provided"); break;
		case "mumbai" : System.out.println("service is provided"); break;
		default : System.out.println("service is not provided"); break;
	}
 * */