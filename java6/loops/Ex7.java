package loops;

import java.util.Scanner;

public class Ex7 {

	/**
	 * @param args
	 * 
	 * 1. take size as input
	 * 
	 * 2.print all even nums till size
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//1. enter size
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		//2.loop for size times
		for( int i=1 ; i <=size; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
	}
}
