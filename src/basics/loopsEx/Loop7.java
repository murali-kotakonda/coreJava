package basics.loopsEx;

import java.util.Scanner;

/**
  1.take the input for a number
  2.find the even numbers from 1 till the input
 */

public class Loop7 {
public static void main(String[] args) {
	//take THE input
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number : ");
	int num = sc.nextInt();
	
	//process
	for(int i=1;i<=num ; i++) {
		if( i%2 ==0 ) {
			System.out.println(i);
		}
	}
	
}
	
}

