package basics.loopsEx;

import java.util.Scanner;

/**
dont take any size as input
take the numbers as input continuosly.
find the sum of all input numbers.
if the sum reaches 100 then stop the prog and print the final sum.

solution):
use while loop as we dont know the number of runs.
*/
public class Loop13 {
public static void main(String[] args) {
	int sum =0;
	Scanner sc = new Scanner(System.in);
	
	while(sum <= 100) {
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		sum = sum + num;
	}
	
	System.out.println("sum = " + sum);
	
}
}

