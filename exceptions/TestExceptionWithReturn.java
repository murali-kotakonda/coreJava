package exceptions;

import java.util.Scanner;

public class TestExceptionWithReturn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int value = div(num1,num2);
		System.out.println("result == "+value);
	}

	private static int div(int num1, int num2) {
		try
		{
			return num1/num2;
		}
		catch(Exception ex){
			System.out.println("number cannot be zero");
			System.out.println("error due to:"+ex.getMessage());
			ex.printStackTrace();
			return -1;
		}finally{
			System.out.println("executed finally");
			return 0;
		}
		
	}
}
