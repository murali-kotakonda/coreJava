package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashSetStrDyna {
	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		//input string till 'END' is encountered
		//3. input the names 
		
		System.out.println("Enter names and type END to stop :");
		while(true)
		{
			System.out.println("Enter name :");
			String name = sc.next();
			if("END".equals(name)){
				break;
			}
			names.add(name);
		}		
		
		System.out.println("Entered NAMES ARE :");
		//4. display the names
		
		print(names);
		
		boolean contains = names.contains("user1");
		System.out.println(contains);
		
		
		names.add("user2");
		System.out.println("after adding user2");
		print(names);
		
		names.isEmpty(); //returns boolean
		names.remove("user2");
		System.out.println("after removing user2");
		print(names);

		System.out.println("size = "+names.size());
		System.out.println("contains user2"+names.contains("user2"));//returns boolean
	
		names.clear();
		System.out.println("size after clear = "+names.size());
	}

	private static void print(Set<String> names) {
		System.out.println("**************************");
		for(String p : names){
			System.out.println(p);
		}
	}
}
