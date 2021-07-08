package loops;

import java.util.Scanner;

/**
 Reverse a number
 
 i/p: 12345
 
 o/p: 54321
*/
public class Ex14Reverse {
	public static void main(String[] args) { 
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		int reverse =0;
		
		while(num!=0) {
			int rem = num%10;
			System.out.println(rem);//1
			num = num/10;// 
			
			reverse = reverse * 10 + rem;
		}
		System.out.println(reverse);
		
	}
}
