package basics.loopsEx;

import java.util.Scanner;

/**
take size as input
print the multiplication table

input:
8

output:
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
8 * 10 = 80
 
*/

public class Loop9 {
public static void main(String[] args) {
	//take THE input
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number : ");
	int num = sc.nextInt();
	
	for( int i=1; i<=10 ; i ++) {
		int res = num * i;
		System.out.println(num + "  * " + i + " = " + res);
	}
}
	
}

