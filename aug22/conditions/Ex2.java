package conditions;

import java.util.Scanner;

/**
 * Req: take two nums as input
 * 
 * 
 * O/P: print the bigger number
 * 
 */
public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter num1");
		int num1 = sc.nextInt();

		System.out.println("enter num2");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("Bigger = " + num1);
		}else {
			System.out.println("Bigger = " + num2);
		}
	}
}
