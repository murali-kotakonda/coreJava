package basics.loopsEx;

import java.util.Scanner;

/**
 enter size
5

enter num 1
10
enter num 2
30
enter num 3
40
enter num 4
60
enter num 5
20

Output:
Big : 60
small : 10
Sum : 160

 */
public class Ex3 {
	public static void main(String[] args) {
		System.out.println("enter size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int small = 0;

		for (int i = 1; i <= size; i++) {
			System.out.println("enter num "+ i);
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
