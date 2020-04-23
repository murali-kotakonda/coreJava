package ds.collections.LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestStringLinkedList {
	public static void main(String[] args) {
		//1. input size
		Scanner  sc = new Scanner(System.in);
		//2. create string array
		List<String> names = new LinkedList<String> ();
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
		names.add(2,"test");
		System.out.println("Entered names are::");
		
		for(String name: names){
			System.out.println(name);
		}
	}
}
