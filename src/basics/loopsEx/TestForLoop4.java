package basics.loopsEx;

import java.util.Scanner;

public class TestForLoop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sum<50){
			System.out.println("enter number");
			int num = sc.nextInt();
			if(num<=0){
				continue;
			}
			if(num==999){
				break;
			}
			sum = sum + num;
		}
		System.out.println(sum);
	}
}
