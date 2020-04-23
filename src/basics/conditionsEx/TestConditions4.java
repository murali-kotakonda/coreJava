package basics.conditionsEx;

import java.util.Scanner;

public class TestConditions4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();
		
		System.out.println("enter age:");
		int age = sc.nextInt();
		
		
		//if id is invalid
		if(id<=0){
			System.out.println("Invalid id!");
		}
		else{
			//id is valid
			if(age<18){
				//invalid age
				System.out.println("Invalid age");
			}else{
				//valid age and valid id
				System.out.println("Id= "+id);
				System.out.println("age="+age);
			}
		}
		
		System.out.println("exit");
	}
}


