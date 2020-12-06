package basics;

import java.util.Scanner;

/**
 
Req:
take two strings as input


O/P: 
print "strings are equal" if both strings are same
print "strings are not equal" if both strings are not same

 */
public class Ex3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	
	//create the scanner object
	System.out.println("enter text1");
	String s1 = sc.next();
	
	System.out.println("enter text2");
	String s2= sc.next();
	
	System.out.println("*****************equals*****************************");
	// compare
		if (s1.equals(s2)) { // case sensitive
			System.out.println("strings are equal");
		} else {
			System.out.println("strings are not equal");
		}
	
	System.out.println("*****************equalsIgnoreCase*****************************");
	// compare
		if (s1.equalsIgnoreCase(s2)) {// case insensitive; ignore the upper/lower case while comparing
			System.out.println("strings are equal");
		} else {
			System.out.println("strings are not equal");
		}
}
}
