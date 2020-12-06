package loops;

import java.util.Scanner;

/**

5.take size as input
then takes numbers for size no of times.
and
find 1.sum 2.big 3. small

ex:
enter size : 4
enter n1 : 30
enter n2 : 40
enter n3 : 50
enter n4 : 20

o/p:
sum : 140
big : 50
small : 20

 */
public class Ex6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the size");
		int num = sc.nextInt();
		
		int sum = 0;
		
		// assignment for big, small
		int big=0;
		int small=0;
		
		for(int i=1; i<=num ; i++) {
			System.out.println("Enter number:"+ i);
			int n = sc.nextInt();
			
			sum = sum + n;
			
		}
		
		System.out.println("SUM  =  "+ sum);
	}
}
