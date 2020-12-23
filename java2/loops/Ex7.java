package loops;

import java.util.Scanner;

/**

take size as input
print sum all all numbers from 1 till the input.

ex: 
input : 5
output : 15 ( 1+ 2+ 3+ 4 +5 )

input : 10
output : 55

*/


public class Ex7 {

	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		int sum =0;
		
		for(int i=1; i<=size; i++){
			sum = sum + i;
		}
		
		System.out.println("sum = "+sum);
		
		System.out.println(" ***************** Approach -2 ************************* ");
	     int res = size * (size +1)/2;
	     System.out.println("sum = "+res);
	}
	
	
}
