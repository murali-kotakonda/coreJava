package oops.methodEx1;

public class Operations2 {

	public int big(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
	
	
	public void bigger(int a, int b) {
		if (a > b)
			System.out.println("big="+a);
		else
			System.out.println("big ="+b);
	}
	
	public int small(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}
	
}