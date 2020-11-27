package conditions;

import java.util.Scanner;

public class CompareStrs {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  

		System.out.println("enter any str1");
		String str1 = sc.next();

		System.out.println("enter any str2");
		String str2 = sc.next();

		// str1 == str2 dont use for strings comparision
		// == will compare the address of str1 and str2
		// equals() will perform the content comparision
		
		if (str1.equals(str2)) {   // or str2.equals(str1)
			System.out.println("strings are equal");
		} else {
			System.out.println("strings are not equal");
		}
	}
}
