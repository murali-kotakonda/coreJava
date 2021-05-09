package conditions;
 
import java.util.Scanner;
/**
	Take two strings as input and check if the two strings are equal or not
 */
public class Ex4 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter string1: ");
	String a = sc.next();
	
	System.out.println("Enter string2: ");
	String b = sc.next();
	
	
	if( a.equals( b)) {
		System.out.println("strings are equal.");
	}else {
		System.out.println("strings are not equal.");
	}
}
}
//dont use == for comparing two strings
// use "equals()" method for comparing two strings




