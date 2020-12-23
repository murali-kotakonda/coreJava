package loops;

import java.util.Scanner;

/**

take size as input
print the factorial of number

ex: 
input : 5
output : 120


input : 6
output : 720

*/


public class Ex6 {

	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		int fact = 1;
		
		 for(int i=1; i<=size; i++){
			  fact = fact * i;
		}
		 System.out.println("factorial = " + fact);
    
	}
}
