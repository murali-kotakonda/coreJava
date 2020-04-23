package basics.loopsEx;

import java.util.Scanner;

public class EvenOd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");

		int num = sc.nextInt();

		System.out.println(" Numbers:");
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
		}

	}

}
