package conditions;
 
import java.util.Scanner;
/**
	Take two numbers as input and find the small of two numbers
 */
public class Ex3 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter num1: ");
	int a = sc.nextInt();
	
	System.out.println("Enter num2: ");
	int b = sc.nextInt();
	
	
	if( a < b) {
		System.out.println("Small =  "+ a);
	}else {
		System.out.println("Small =  "+ b);
	}
}
}





