package arrays;

import java.util.Scanner;

/**
 * @author I335484
 * take size as input
 * and take input for every element 
 * print all
 */
public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//take input size
		System.out.println("enter size");
		
		int size = sc.nextInt();
		
		//input every element and add to array
		String names [] = new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter name");
			//input element
			String name = sc.next();
			//add to array
			names[i] = name;
		}
		
		System.out.println("print all");
		for(String n: names) {
			System.out.println(n);
		}
		
	}
}
