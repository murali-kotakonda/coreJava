package conditions;
 
/**
Find big of three numbers.
 */
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//input
		System.out.println("Enter three numbers ::");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();

		//process
		int big = n1;

		//compare with n2
		if(n2 > big) {
			big = n2;
		}
		
		//compare with n3
		if(n3 > big) {
			big = n3;
		}
		
		//compare with n4
		if (n4 > big) {
			big = n4;
		}
		
		//output
		System.out.println("Big = " + big);

	}
}
