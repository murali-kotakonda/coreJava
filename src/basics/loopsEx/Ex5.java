package basics.loopsEx;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		String name ="";
		while (!name.equals("end")) {
			System.out.println("Enter name::");
			name = sc.next();
			result = result + " " +name;
		}
		System.out.println("names ==" + result);
	}
}
