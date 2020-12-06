package conditions;

import java.util.Scanner;

/**
  switch statement:
  	compare one variable against multiple values...
  	
 Req:
 Input month number
 
 O/P: Month name

 */
public class Ex11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	//take id, userType , age as input
	System.out.println("enter month num");
	int monthNum = sc.nextInt();
	
	// write variable to compare in switch
	
	// write the case for every value
	// beak is mandatory for every case
	
	// if no case is matching , write the default
	switch(monthNum) {
	case 1 : System.out.println("January");  break;
	case 2 : System.out.println("FEB");  break;
	case 3 : System.out.println("MAR");  break;
	case 4 : System.out.println("APR");  break;
	case 5 : System.out.println("MAY");  break;
	case 6 : System.out.println("JUNE");  break;
	case 7 : System.out.println("JULY");  break;
	case 8 : System.out.println("AUGUST");  break;
	case 9 : System.out.println("SEP");  break;
	case 10 : System.out.println("OCT");  break;
	case 11 : System.out.println("NOV");  break;
	case 12 : System.out.println("DEC");  break;
	default : System.out.println("invalid month num");
	}
}
}
