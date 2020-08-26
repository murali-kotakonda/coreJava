package ds.collections.arrays;

import java.util.Scanner;

public class TestStringWithInput {
	public static void main(String[] args) {
		// input n Strings and display it
		//1. input size
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		//2. declare and initialize the array with the input size
		String[] names = new String[size];
		
		//3. input the names 
		for (int i = 0; i < size; i++) {
			System.out.println("Enter name ::" + (i + 1));
			String name = sc.next();
			names[i] = name;
		}		
		
		System.out.println("Items in array are:");
		
		for(String p : names){
			System.out.println(p);
		}
	}
}
