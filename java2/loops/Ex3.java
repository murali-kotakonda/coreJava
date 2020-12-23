package loops;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// take size as input
		// print nos from 1 to the input
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");
		int size = sc.nextInt();
		System.out.println("*********************** For loop*********************");
		for (int i = 1; i <= size; i++) {
			System.out.println(i);
		}

		System.out.println("*********************** while loop*********************");
		int j = 1;

		while (j <= size) {
			System.out.println(j);
			j++;
		}
	}
}
