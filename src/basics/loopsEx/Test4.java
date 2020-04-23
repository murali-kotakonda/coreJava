package basics.loopsEx;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x = sc.nextInt();
		int[][] array = new int[x][x];
		System.out.println("This is the source array.");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int b = array[i][j];
				array[i][j] = (int) (Math.random() * 10);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		while (true) {
			System.out.println("You can rotate the matrix ");
			System.out.println("   Press - 1: 90 degree right"); // 3
			System.out.println("   Press - 2: 180 degree"); // 2
			System.out.println("   Press - 3: 270 degree right"); // 1
			System.out.println("   Press - 4: Exit");
			int n = sc.nextInt();
			if (1 <= n && n <= 3) {
				if (n == 4) {
					break;
				}
				if (n == 1) {
					n = 3;
				} else if (n == 2) {
					n = 2;
				} else if (n == 3) {
					n = 1;
				}
				for (int d = 0; d < n; d++) {
					for (int i = 0; i < array.length / 2; i++) {
						for (int j = i; j < array.length - 1 - i; j++) {
							int time = array[i][j];
							array[i][j] = array[j][array.length - 1 - i];
							array[j][array.length - 1 - i] = array[array.length - 1 - i][array.length - 1 - j];
							array[array.length - 1 - i][array.length - 1 - j] = array[array.length - 1 - j][i];
							array[array.length - 1 - j][i] = time;
						}
					}
				}
				System.out.println("You changed the matrix like this");
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array.length; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("You enter wrong numbers.");
			}
		}
	}
}
