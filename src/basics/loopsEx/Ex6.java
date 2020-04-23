package basics.loopsEx;

import java.util.Scanner;

public class Ex6 {
	public static void main0(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
		}

	}

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");

		int rows = sc.nextInt();
		for (int i = rows; i >= 1; i--) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int rows = sc.nextInt();
		for (int i = rows; i >= 1; i--) {
			System.out.println();
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
		}

	}

}
