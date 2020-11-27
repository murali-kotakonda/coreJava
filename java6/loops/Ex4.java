package loops;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int sum = 0;
		
		for( int i=1 ; i <=size; i++) {
			sum = sum +i;
		}
		System.out.println(sum);
	}
}
