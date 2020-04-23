package basics.conditionsEx;

import java.util.Scanner;

//take input for id , age
//validate id & age
//if id is positive print valid id , if not print invalid id
//if age is greater than 18 print valid age else print invalid age

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();
		System.out.println("enter id");
		int id = sc.nextInt();
		
		if(id>0) {
			System.out.println("valid id");
		}
		else {
			System.out.println("invalid id");
		}
		
		if(age>18){
			System.out.println("valid age");
		}else {
			System.out.println("invalid age");
		}
	}

}
