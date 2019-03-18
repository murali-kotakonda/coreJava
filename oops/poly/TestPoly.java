package oops.poly;

public class TestPoly {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int sum1=cal.add(5,6); 
		System.out.println(sum1);
		
		int sum2 = cal.add(1,2,3);
		System.out.println(sum2);
		
	 	float sum3 = cal.add(12f,  10.0f);
		System.out.println(sum3);
		
		long sum4 = cal.add(12l, 10l);
		System.out.println(sum4);
	}
}
