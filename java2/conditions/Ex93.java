package conditions;

import java.util.Scanner;
/**
 * @author I335484
 * take 3 nos as input and find the big no
 */
public class Ex93 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter num1");
		int n1 = sc.nextInt();
		
		System.out.println("enter num2");
		int n2 = sc.nextInt();
		
		System.out.println("enter num3");
		int n3 = sc.nextInt();
		

		if (n1 > n2) {
			// n1 and n3
			if (n1 > n3) {
				System.out.println("Bigger is " + n1);
			} else {
				System.out.println("Bigger is " + n3);
			}
		} else {
			// n2 and n3
			if (n2 > n3) {
				System.out.println("Bigger is " + n2);
			} else {
				System.out.println("Bigger is " + n3);
			}
		}
	}
	
}




