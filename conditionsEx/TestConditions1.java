package conditionsEx;

import java.util.Scanner;

public class TestConditions1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();
		
		if(age>18){
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("id = "+id);
		}
		
		System.out.println("age ="+age);
		System.out.println("exit");
	}
}
