package conditions;
 
import java.util.Scanner;
/**
	Take two numbers as input and find the big of two numbers
 */
public class Ex2 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter num1: ");
	int a = sc.nextInt();
	
	System.out.println("Enter num2: ");
	int b = sc.nextInt();
	
	
	if( a > b) {
		System.out.println("Big =  "+ a);
	}else {
		System.out.println("Big =  "+ b);
	}
}
}





