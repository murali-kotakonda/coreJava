package ds.collections.hashseteX2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetString6 {
	public static void main(String[] args) {
		//1. input size
		Scanner  sc = new Scanner(System.in);
		//2. create string array
		Set<String> names = new TreeSet<String> ();
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
		
	}
}
