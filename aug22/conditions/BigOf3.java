package conditions;

import java.util.Scanner;

public class BigOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int n1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int n2 = sc.nextInt();
		
		System.out.println("Enter num3");
		int n3 = sc.nextInt();
		
		int big = n1;
		
		
		if( n2 > big) {
			big = n2;
		}
		
		if( n3 > big) {
			big = n3;
		}
		
		System.out.println("BIG =" + big);
	}
}
