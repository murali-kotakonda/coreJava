package basics.loopsEx;

import java.util.Scanner;

/**

1.take input for " how many numbers"
2.take input for "what are the numbers"

i/p:
how many numbers : 5
what are the numbers :
20
30
15
12
14


o/p:
sum : 65
big : 30
small : 15

*/

public class Loop11 {
public static void main(String[] args) {
	//take THE input
	Scanner sc = new Scanner(System.in);
	System.out.println("how many numbers : ");
	int num = sc.nextInt();
	int sum =0;
	int big =0;
	int small=0;
	
	System.out.println("what are the numbers : ");
	for( int i=1;i<=num ; i++) {
		System.out.println("Enter number " + (i) + " :");
		int n = sc.nextInt();
		sum = sum + n;
	}
	
	
	//output
	System.out.println("Sum = "+sum);
	System.out.println("big = "+big);
	System.out.println("small = "+small);
	
}
}

