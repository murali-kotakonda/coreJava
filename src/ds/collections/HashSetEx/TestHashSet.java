package ds.collections.HashSetEx;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashSet {
public static void main(String[] args) {
	Set<String> names = new HashSet<String>();
	Scanner sc = new Scanner(System.in);

	//input string till 'END' is encountered
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
	
	System.out.println("Enter name to search:");
	String input = sc.next();
	if(names.contains(input)){
		System.out.println("item found");
	}else{
		System.out.println("item not found");
	}
	
}
}
