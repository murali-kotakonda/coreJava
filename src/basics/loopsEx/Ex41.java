package basics.loopsEx;

import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (sum <= 100) {
			System.out.println("Enter Number::");
			int num = sc.nextInt();
			if(num<=0) {
				continue;
			}
			sum = sum + num;
		}
		System.out.println("sum==" + sum);
	}
}
