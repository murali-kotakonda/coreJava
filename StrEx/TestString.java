package StrEx;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class TestString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any String ::");
	String input = "Hi hello user, bye user   ";
	//get string length;
	int len = input.length();
			
	System.out.println("Length::  "+len);
	
	//check if begings with Hi
	boolean check = input.startsWith("hi");
	if( check){
		System.out.println("starts with Hi");
	}else{
		System.out.println("not strating with Hi");
	}
	
	
	//check if ends with bye
		check = input.endsWith("bye");
		if (check) {
			System.out.println("ends with bye");
		} else {
			System.out.println("not ends with Bye");
		}
		
		String afterReplace = input.replaceAll("user", "kumar");
		System.out.println(input);
		System.out.println(afterReplace);
		
		
		String toUpper = input.toLowerCase();
		String toLower = input.toUpperCase();
		
		String trimResult = input.trim();

		String substring = input.substring(5, 10);
		System.out.println(substring);
		
		substring = input.substring(5);
		System.out.println(substring);
		
		
		String myStr= "hello1";
		int position = input.indexOf(myStr);
		System.out.println(position);
		
		
		String data ="2000:34:Kumar:Shyam:dep345";
		String[] result = data.split(":");
		
		System.out.println(result[0]);
		System.out.println(result[2] + ", " +result[3]);
		
		
		
		
		
		
		
}
}
