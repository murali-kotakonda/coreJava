package loops;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		for( int i=1 ; i <=size; i++) {
			System.out.println(i);
		}
	}
	
	
}
