package arrays;

import java.util.Scanner;

/**
 * @author I335484
 */
public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String names [] = {"hyd","bang","chennai","mumbai","pune"};
		
		//search by content : slow it requires linear search 
		System.out.println("enter city name to search:");
		String city = sc.next();
		
		boolean found = false;
		for(String c: names) {
			if(city.equals(c)) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("element found");
		}else {
			System.out.println("element not found");
		}
		
	}
}
