package ds.collections.arrays;

import java.util.Scanner;

public class TestPersonsArray {
	public static void main(String[] args) {

		// 1. input size
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		Person[] persons = new Person[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter name");
			String name= sc.next(); 
			Person pObj = new Person(i+1, name);
			persons[i] = pObj;
		}

		//System.out.println("--- displaying using for loop----");

		// enhanced for loop
		System.out.println("--- displaying using enhancd for loop----");
		for (Person p : persons) {
			System.out.println(p);
		}

		System.out.println(persons[3]);
		/*
		 * for(int i=0; i<size;i++) { System.out.println(persons[i]); }
		 */
		

	}
}
