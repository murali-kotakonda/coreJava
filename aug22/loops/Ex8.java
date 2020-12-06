package loops;

import java.util.Scanner;

/**
 
without size:
-------------------------------------------------------

Take nums as input
and perform sum
if the sum reaches 100 , stop and print final sum
if the customer enters a negative num  then don't perform any sum
 
solution:
-   continue [ use inside the loops ]
-   continue is a keyword and continue statement stops current run and it will go to the next run.


 */

public class Ex8 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
			
	int sum =0;
	
	while(sum<100) {
		System.out.println("enter num");
		int n = sc.nextInt();
		
		if(n<0) {
			continue;
		}
		sum = sum + n;
	}
	
	System.out.println("sum = " + sum);
	
}
}
