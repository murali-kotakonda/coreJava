package StringOper;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String input= sc.next();
		
		//find the length of string
		int size = input.length();
		System.out.println("size = "+ size);
		
		//convert to upper/lower
		String lowerValue = input.toLowerCase();
		String upperValue = input.toUpperCase();
		System.out.println("upper case = "+upperValue);
		System.out.println("lower  case = "+lowerValue);
		
		
		
		
		 
	}
}