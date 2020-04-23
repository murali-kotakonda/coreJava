package ds.collections.al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestStringArrayList2 {
	public static void main(String[] args) {
		//1. input size
		Scanner  sc = new Scanner(System.in);
		//2. create string array
		ArrayList<String> names = new ArrayList<> ();
		//input name for size number of times
		String inputCh = null;
		
		do{
			System.out.println("Enter name:");
			String name = sc.next();
			names.add(name);
			
			System.out.println("DO you want to contiue(yes/no??");
			inputCh = sc.next();
		}while(inputCh.equalsIgnoreCase("yes"));

		//display names:
		System.out.println("Entered names are::");
		
		for(String name: names){
			System.out.println(name);
		}
		
		
		
		
		
		names = Arrays.asList(a)
		
		
		System.out.println("Second element::--"+names.get(1)); // get the 2nd item inside the arraylist
		System.out.println("arraylist contains test1 ::"+names.contains("hello"));
		System.out.println("postion of string test1 in the arraylist  ::"+names.indexOf("hello"));
		names.remove(0);
		System.out.println("after removal items are::");
		for(String name: names){
			System.out.println(name);
		}
		
	}
}
