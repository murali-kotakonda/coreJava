package loops;

import java.util.Scanner;

/**
input : 5


output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
public class Ex13Pattern {
	public static void main(String[] args) { 
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<= num ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

}
