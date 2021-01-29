package ds.collections.al;


import java.util.ArrayList;
import java.util.List;

public class Ex1String {
public static void main(String[] args) {
		
		//create the list 
		List<String> names = new ArrayList<>();
		
		
		//add strings
		names.add("kumar");
		names.add("raju");
		names.add("ram");
		names.add("shyam");
		names.add("renu");
		
		//print all names 
		for(String data: names ){
			System.out.println(data);
		}
		
		
	}
}
