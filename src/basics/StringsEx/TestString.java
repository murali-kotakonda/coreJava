package basics.StringsEx;

import java.util.Scanner;

public class TestString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any String ::");
	String input = sc.nextLine();
	
	//get string length;
	int length = input.length();
	System.out.println("Length::  "+length);
	
	//check if the string ends with bye
	boolean check1 = input.endsWith("bye");
	System.out.println("String ending with bye:: "+check1);
	
	//check if the string starts with hi
	boolean check2 = input.startsWith("Hi");
	System.out.println("String starting  with Hi:: "+check2);
	
	//replace
	String old ="kumar";
	String newStr ="shyam";
	System.out.println("Replace all you with ::"+input.replaceAll(old, newStr));
	System.out.println("replaceFirst  ::"+input.replaceFirst(old, newStr));
	
	//compare two string by ingnoring the case ex:: comparing user name 
	System.out.println("compare with equalsIgnoreCase  ::"+"india".equalsIgnoreCase(input));
	
	//compare  two string with exact match ex:: comparing password
	System.out.println("compare with equals::"+"india".equals(input));

	System.out.println("to upper ::"+input.toUpperCase());
	System.out.println("to Lower :: "+input.toLowerCase());

	String data =" dvdgdgdgd vsdgdgdg dgdgdgdg ";
	System.out.println("Before:--"+data+"--");
	System.out.println("To Trim:--"+data.trim()+"--");

	//substring
	System.out.println("sub string from 6 to 10:: "+input.substring(5, 10));
	System.out.println("sub string from 6 to end:: "+input.substring(5));
	
	//index of
	//indiaismycountry 0 
	//myindiamycountry 2
	//mycountryindia   9
	//hell how are you  -1
	System.out.println(input.indexOf("india"));
	
	String inputStr ="kumar#23#2334566#bncpk97404";
	String[] data1 = inputStr.split("#");  // retuns an array
	System.out.println(data1[3]);
	System.out.println(data1[0]);
	System.out.println(data1[1]);
	System.out.println(data1[2]);
	System.out.println(inputStr.charAt(6));
}

/*System.out.println(data1[0]);
System.out.println(data1[1]);
System.out.println(data1[2]);
*/
}
