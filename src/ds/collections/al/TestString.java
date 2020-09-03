package ds.collections.al;


import java.util.LinkedList;
import java.util.List;


public class TestString {
	public static void main(String[] args) {
			
			//1.Create Vector for String
			List<String> names = new LinkedList<String>();
			
			// 2. add names
			names.add("kumar");
			names.add("ram");
			names.add("raj");
			names.add("shyam");
			names.add("teju");
			
			//3. display names:
			System.out.println("******print all names**********");
			for(String n : names) {
				System.out.println(n);
			}
		}
}
