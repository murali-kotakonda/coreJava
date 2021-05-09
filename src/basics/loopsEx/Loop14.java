package basics.loopsEx;

import java.util.Scanner;

/**
dont take any size as input
take the numbers as input continuosly.
find the sum of all input numbers.
if the input is a negative number then stop the prog and print the final sum.

solution):
use while loop as we dont know the number of runs.
*/
public class Loop14 {
public static void main(String[] args) {
	int sum =0;
	Scanner sc = new Scanner(System.in);
	
	int num = 0;
	while(num >= 0) {
		System.out.println("Enter number: ");
		num = sc.nextInt();
		sum = sum + num;
	}
	System.out.println("sum = " + sum);
}
}

