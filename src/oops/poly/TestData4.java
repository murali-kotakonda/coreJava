package oops.poly;

public class TestData4 {
	public static void main(String[] args) {
		Data4 cal = new Data4();
		
		
		double a1 = cal.add(4, 5);//int, int
		System.out.println(a1);
		
		
		double a2 = cal.add(12.76f, 13.66f);//float,float
		System.out.println(a2); 
		
		
		double a3 = cal.add(1313113L , 141414L);//long,long
		System.out.println(a3); 
		
		
		double a4 = cal.add(131232323.324324d , 214242.3545d); //double, double
		System.out.println(a4);
	}
}
