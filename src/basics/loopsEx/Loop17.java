package basics.loopsEx;

import java.util.Scanner;

/**
While:
check the condition 1st and then execute the block

do While:
execute the block 1st and the check the condition

*/

import java.util.Scanner;

/**
dont take any size as input
take the numbers as input continuosly.
find the sum of all input numbers.
if the input is a negative number then stop the prog and print the final sum.

solution):
use while loop as we dont know the number of runs.
*/
public class Loop17 {
public static void main(String[] args) {
	int sum =0;
	Scanner sc = new Scanner(System.in);
	
	int num = 0;
	do {
		System.out.println("Enter number: ");
		num = sc.nextInt();
		sum = sum + num;
	}while(num >= 0);
	System.out.println("sum = " + sum);
}
}

/*

Output for while statement:
--------------------------------------
Enter number: 
10
Enter number: 
-20
sum = -10

 * */
