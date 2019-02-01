package loops;

import java.util.Scanner;

public class TestLoopsEx2 {
	public static void main(String[] args) {

		System.out.println("enter siZe");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=size;i++){
			System.out.println("enter number");
			int num = sc.nextInt();
			sum = sum + num;
		}
		
		System.out.println("sum= "+sum);
		System.out.println("end of execution");
		
		
	}
}
