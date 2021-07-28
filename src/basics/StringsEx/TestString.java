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
	
	//convert to upper
	System.out.println("to upper ::"+input.toUpperCase());
	
	//convert to lower
	System.out.println("to Lower :: "+input.toLowerCase());


	//compare two string by ingnoring the case ex:: comparing user name 
	System.out.println("compare with equalsIgnoreCase  ::"+"india".equalsIgnoreCase(input));
	
	//compare  two string with exact match ex:: comparing password
	System.out.println("compare with equals::"+"india".equals(input));

	
	
	//replace
	String old ="kumar";
	String newStr ="shyam";
	input = "hello mkumar how are you kumar";
	System.out.println("Replace all you with ::"+input.replaceAll(old, newStr));
	System.out.println("replaceFirst  ::"+input.replaceFirst(old, newStr));
	
	//how to remove blank spaces in the input string prefix and suffix
	String data ="          hello welcome to java world                ";
	System.out.println("Before:--"+data+"--");
	System.out.println("To Trim:--"+data.trim()+"--");

	//how to find the substring for the given string : use substring() method
 	input = "Java is a program language";

 	//get the single char at a give position
	 System.out.println(input.charAt(0));
	 System.out.println(input.charAt(1));
	 

	 
 			//how to find the substring for the given string : use substring() method
		System.out.println("*************Substring*******************");
		input = "Java is a program language";
		System.out.println(input.substring(0));//print from 1st char till end 
		System.out.println(input.substring(1));//print from 2nd char till end
		
		System.out.println(input.substring(0,1));//from 0 to 0
		System.out.println(input.substring(0,2));//from 0 to 1
		System.out.println(input.substring(0,3));//from 0 to 2
		
		System.out.println(input.substring(3,7));//from 3 to 6
		
		System.out.println(input.substring(5,10));//from 5 to 9
		
	System.out.println("sub string from 6 to 10:: "+input.substring(5, 10));
	System.out.println("sub string from 6 to end:: "+input.substring(5));
	
	
	//how to find if the second string is a  substring of the 1st string : use indexOf() method
	//india is my country 0 
	//myindiamycountry 2
	//mycountryindia   9
	//hell how are you  -1
	String mainString ="Hello india is my country";
	   
	String s1 = "Hello india is my country";
	String s2 = "india is my country";
	String s3 = "my country";
	String s4 = "hell how are you";
	
	System.out.println(mainString.indexOf(s1));
	System.out.println(mainString.indexOf(s2));
	System.out.println(mainString.indexOf(s3));
	System.out.println(mainString.indexOf(s4));
	
	// indexOf retuns the position number
	// if indexOf returns -1 , second string is not a substring of the 1st string
	// if indexOf returns >=0 , second string is a substring of the 1st string
	
	// when multiple data is appended to a string seperated by delimitor then split() method
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
