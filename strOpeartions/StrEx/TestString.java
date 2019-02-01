package strOpeartions.StrEx;

import java.util.Scanner;

public class TestString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any String ::");
	String input = sc.nextLine();
	//get string length;
	System.out.println("Length::  "+input.length());
	
	//check if the string ends with india
	System.out.println("String ending with bye:: "+input.endsWith("bye"));
	
	//CHECK IF THE STRING BEGINGS WITH HI
	System.out.println("String starting  with HI:: "+input.startsWith("HI"));
	
	
	//replaceing
	String old ="Hi";
	String newStr ="Hello";
	System.out.println("Replace all Hi with Hello ::"+input.replaceAll(old, newStr));
	
	System.out.println("replaceFirst Hi with Hello ::"+input.replaceFirst(old, newStr));
	
	//compare two string by ingnoring the case ex:: comparing user name 
	System.out.println("compare with equalsIgnoreCase  ::"+"india".equalsIgnoreCase(input));
	
	//compare  two string with exact match ex:: comparing password
	System.out.println("compare with equals::"+"india".equals(input));
	
	System.out.println("to upper ::"+input.toUpperCase());
	System.out.println("to Lower :: "+input.toLowerCase());
	
	String data =" dvdgdgdgd vsdgdgdg dgdgdgdg ";
	System.out.println("Before:--"+data+"--");
	System.out.println("To Trim:--"+data.trim()+"--");
	
	
	System.out.println("sub string from 6 to 10:: "+input.substring(5, 10));
	System.out.println("sub string from 6 to end:: "+input.substring(5));
	
	//indexof method checks if the subString is available in the input.
	// if substring is available o/p will be >=0
	//if substring is not available output == -1
	//123451234512345    -1
	//indiaismycountry 0 
	//myindiamycountry 2
	//mycountryindia   9
	System.out.println(input.indexOf("India"));
	
}
}
