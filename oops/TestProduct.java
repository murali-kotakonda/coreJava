package oops;

public class TestProduct {

	public static void main(String[] args) {
		Product  p1 = new Product();
		p1.cost = 5000d;
		p1.name="mobile";
		p1.brand="sony";
		p1.discount=1000d;
		
		
		Product  p2 = new Product();
		p2.cost = 79000d;
		p2.name="laptop";
		p2.brand="lg";
		p2.discount=2000d;
		
		
		p1.show();
		p2.show();
		
	/*	System.out.println(p1.cost);
		System.out.println(p1.name);
		
		System.out.println(p2.cost);
		System.out.println(p2.name);
	*/	
	}
}
