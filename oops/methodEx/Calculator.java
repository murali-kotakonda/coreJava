package oops.methodEx;

public class Calculator {
	
	public void add(int n1,int n2){
		System.out.println("sum = "+ (n1+n2));
	}
	
	public void sub(int n1,int n2){
		System.out.println("sub = "+ (n1-n2));
	}
	
	public int div(int num1, int num2){
		int res = num1/num2;
		return res;
	}
	
	public int mul(int n1,int n2){
		int res = n1*n2;
		return res;
	}
}
