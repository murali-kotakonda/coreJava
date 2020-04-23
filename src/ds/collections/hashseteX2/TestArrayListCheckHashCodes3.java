package ds.collections.hashseteX2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayListCheckHashCodes3 {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		//input string till 'END' is encountered
		//3. input the names 
		
		System.out.println("Enter person names and type END to stop :");
		while(true)
		{
			System.out.println("Enter name :");
			String name = sc.next();
			if("END".equals(name)){
				break;
			}
			Person per = new Person(123, name,28);
			// 1.get hashcode : per.hashCode()
			//2.apply hashFunctn that gives result between 0 to 40;
			persons.add(per);
		}		
		
		System.out.println("Entered PERSONS ARE :");
		
		for(Person p : persons){
			System.out.println(p.hashCode() + "--"+p);
		}

	
}

}
