package ds.collections.al;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 - size as input
 - add names till size no of times
 - print all names
 */
public class Ex2TestStringInput {
	public static void main(String[] args) {
		//1. input size
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter size::");
		int size = sc.nextInt();
		
		
		//2. create string array
		List<String> names = new ArrayList<> ();
		
		for(int i=1;i<=size;i++) {
			 System.out.println("Enter name :"+ i);
			 String name= sc.next();  // take name as input
			 names.add(name);  // add to the arraylist
		}
		
		
		//display names:
		System.out.println("Entered names are::");
		for(String name: names){
			System.out.println(name);
		}
		
		
	}
	
}
