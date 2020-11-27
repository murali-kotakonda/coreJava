package whileProps;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		/*
   			enter the nums.
   			perform the sum
   			if sum reaches 100 then stop prog 
		 * */
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		while( sum <100) {
			System.out.println("enetr num");
			int n1 = sc.nextInt();
			sum = sum +n1;
		}
		System.out.println("sum = "+sum);
		
	}
	
}
