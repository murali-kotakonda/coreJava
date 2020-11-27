package loops;

import java.util.Scanner;

public class Ex5 {

	/**
	 * @param args
	 * 
	 * 1. take size as input
	 * 
	 * 2.what are the nums
	 * 
	 * 3. sum , 4. big , 5. small
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int sum =0; 
		int big =0;
		int small=0;
		for( int i=1 ; i <=size; i++) {
			
			System.out.println("enter numer "+i);
			int n1 = sc.nextInt();
			
			if(i==1) {
				big = n1;
				small= n1;
				
			}
			
			if(n1>big) {
				big =n1;
			}
			
			if(n1<small) {
				small= n1;
			}
			
			sum = sum +n1;
		}
		
		System.out.println("sum = "+ sum);
		System.out.println("big = "+ big);
		System.out.println("small = "+ small);
	}
}
