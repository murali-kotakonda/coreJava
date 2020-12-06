package loops;

import java.util.Scanner;

/**
 
without size:
-------------------------------------------------------

Take nums as input
and perform sum
if the sum reaches 100 , stop and print final sum
if the customer enters a negative num  then stop and print final sum .

solution:
-   break [ use inside the loops ]
-   break is a keyword and break statement stops all the runs and it will come out of the loop

 */

public class Ex9 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
			
	int sum =0;
	
	while(sum<100) {
		System.out.println("enter num");
		int n = sc.nextInt();
		
		if(n < 0) {
			break;
		}
		sum = sum + n;
	}
	
	System.out.println("sum = " + sum);
	
}
}
