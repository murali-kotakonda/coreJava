package basics.conditionsEx;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n1:");
		int n1 = sc.nextInt();
		System.out.println("enter n2:");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("big = "+n1);
		}else {
			System.out.println("big ="+n2);
		}
	}
}
