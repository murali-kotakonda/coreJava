package basics.conditionsEx;

import java.util.Scanner;

public class TestBig2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X");
		int x = sc.nextInt();
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		System.out.println("Enter the value of z");
		int z = sc.nextInt();
		if (x > y) {
			if (x > z)
				System.out.println("big =" + x);
			else
				System.out.println("big =" + z);
		} else {
			if (y > z)
				System.out.println("big =" + y);
			else
				System.out.println("big =" + z);
		}
	}
}
