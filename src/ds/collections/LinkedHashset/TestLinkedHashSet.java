package ds.collections.LinkedHashset;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TestLinkedHashSet {
public static void main(String[] args) {
	
	Set<String> names = new LinkedHashSet<String>();
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
	
}
}
