package conditionsEx;

import java.util.Scanner;

public class TestConditions0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();
		
		if(age>18){
			System.out.println("valid age");
		}else{
			System.out.println("in valid age");
		}
		
		System.out.println("exit");
	}
}
