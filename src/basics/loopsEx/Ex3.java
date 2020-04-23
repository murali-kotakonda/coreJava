package basics.loopsEx;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("enter size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int small = 0;

		for (int i = 1; i <= size; i++) {
			System.out.println("enter num");
			int num = sc.nextInt();
			if (i == 1) {
				small = num;
			}
			if (small > num) {
				small = num;
			}

		}
		System.out.println(small);
	}
}
