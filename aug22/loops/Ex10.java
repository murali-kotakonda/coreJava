package loops;

import java.util.Scanner;

/**
 
while:
- condition is mandatory
- init/increment are optional
- condition is checked 1st and then the body is executed

do while :
- condition is mandatory
- init/increment are optional
- body is executed  1st and then the condition is checked.

.take nums as input
and perform sum
if the sum reaches 100 , stop and print final sum
 
 */

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		do {
			System.out.println("enter num");
			int n = sc.nextInt();
			sum = sum + n;
		}while (sum < 100);

		System.out.println("sum = " + sum);
	}
}
