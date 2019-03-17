package ds.collections.hashseteX2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashSetString1 {
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
		
		for(String p : names){
			System.out.println(p);
		}
		
		boolean contains = names.contains("user1");
		System.out.println(contains);
		
	}
}
