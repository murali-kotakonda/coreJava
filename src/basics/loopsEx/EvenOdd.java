package basics.loopsEx;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");

		int num = sc.nextInt();

		System.out.println("Even Numbers:");
		for (int i = 1; i <= num; i = i + 2) {
			if(i%2==0)
				System.out.print(i + " ");

		}


		System.out.println("Even Numbers:");
		for (int i = 1; i <= num; i = i + 2) {
			System.out.print(i + " ");

		}

		System.out.println("\n\nOdd Numbers:");
		for (int i = 2; i <= num; i = i + 2) {
			System.out.print(i + " ");

		}
	}

}
