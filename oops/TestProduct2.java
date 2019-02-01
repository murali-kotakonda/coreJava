package oops;

public class TestProduct2 {

	public static void main(String[] args) {
		Product  p1 = new Product("mobile", 5000d,"sony",1000d);
		
		
		Product  p2 = new Product();
		p2.cost = 79000d;
		p2.name="laptop";
		p2.brand="lg";
		p2.discount=2000d;

		
		Product  p3 = new Product("shoes", 2000,"reebok",150d);
		p1.show();
		p2.show();
		p3.show();
		
	/*	System.out.println(p1.cost);
		System.out.println(p1.name);
		
		System.out.println(p2.cost);
		System.out.println(p2.name);
	*/	
	}
}
