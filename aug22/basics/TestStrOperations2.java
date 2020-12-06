package basics;

import java.util.Scanner;

/**
  Explore the methods for string. 
  
 */
public class TestStrOperations2 {
	public static void main(String[] args) { 
		
		System.out.println("***************REPLACE**************************");
		String data = "Hi kumar how are you kumar";
		//replace kumar with shymam
		
		System.out.println(data.replaceAll("kumar", "shyam"));
		System.out.println(data.replaceFirst("kumar", "shyam"));
		
		System.out.println("*******************TRIM****************************");
		
		//remove the white spaces 
		data = "      Hello welcome to java      ";
		System.out.println("-"+data +"-");
		System.out.println("-"+data.trim() +"-");
		
		System.out.println("*******************Substring****************************");
		data ="1234567890";// index or position starts from 0
		System.out.println(data.substring(4)); // displays from position 5 till the end
		System.out.println(data.substring(4,8)); // displays from position 5 till the 8
		
		System.out.println("*******************CHAR AT****************************");
		data ="ABCDEFGH";
		System.out.println(data.charAt(0));
		System.out.println(data.charAt(3));
		
		System.out.println("************find position of char******************");
		data ="ABCDEFGH";
		System.out.println(data.indexOf("B")); // 1
		System.out.println(data.indexOf("ABC")); // 0, as ABC exists from 0 position
		System.out.println(data.indexOf("ABD"));// RETURNs -1 
		
		System.out.println("************split******************");
		data ="1234#kumar varma#34#IT#123456";// a str has multipl data seperated by #
		//extract individual  data
		String[] datas  = data.split("#") ; //returns an array
		System.out.println(datas[0]);
		System.out.println(datas[1]);
		System.out.println(datas[2]);
		System.out.println(datas[3]);
		System.out.println(datas[4]);
	}
}
