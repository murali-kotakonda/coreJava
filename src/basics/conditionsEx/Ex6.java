package basics.conditionsEx;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter str1:");
		String n1 = sc.next();
		System.out.println("enter str2:");
		String n2 = sc.next();
		
		if(n1.equals(n2)) {
			System.out.println("strings are equal");
		}else {
			System.out.println("strings are not equal");
		}
		
		
	}

}
