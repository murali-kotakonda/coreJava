package oops;

public class Process {

	
	public void mul(int x) {
		for (int i = 1; i <= x; i++) {
			System.out.println(x + "  *  " + i + " = " + x * i);
		}
	}
	
	
	public int factorial(int x) {
		int res= 1;
		
		for(int i=1;i<=x;i++) {
			res = res*i;
		}
		
		return res;
		
	}
}
