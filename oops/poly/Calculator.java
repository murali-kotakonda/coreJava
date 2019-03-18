package oops.poly;

public class Calculator {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	} 
	
 	public int add(int a, int b , int c) {
		int sum = a + b+c;
		return sum;
	}

 	public long add(long a, long b ) {
		long sum = a + b;
		return sum;
	}
 	
	public float add(float a, float b ) {
		float sum = a + b;
		return sum;
	}
	
	public void add(int a, float b ) {
		System.out.println(a + b);
	}
	
	public void add(float a, int b ) {
		System.out.println(a + b);
	}
	
}
