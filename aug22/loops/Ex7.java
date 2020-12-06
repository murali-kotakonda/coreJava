package loops;

import java.util.Scanner;

/**
 
without size:
-------------------------------------------------------

7.take nums as input
and perform sum
if the sum reaches 100 , stop and print final sum

for -> when we know the size/no of runs/iterations

while, do+while  : when we don't the no of runs/iterations.

every for prog can be converted to while.
 */

public class Ex7 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
			
	int sum =0;
	
	while(sum<100) {
		System.out.println("enter num");
		int n = sc.nextInt();
		sum = sum + n;
	}
	
	System.out.println("sum = " + sum);
	
}
}
