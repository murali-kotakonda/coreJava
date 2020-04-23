package basics.conditionsEx;

import java.util.Scanner;

public class TestLogicalOr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		String city = sc.next();
		if(city.equals("Hyderabad")||
				city.equals("Bangalore")||
				city.equals("Chennai")||
				city.equals("Mumbai")){
			System.out.println("Product can be delivered");
		}else{
			System.out.println("Product cannot be delivered.");
		}
			
	}
}
