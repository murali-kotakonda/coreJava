package oops.methods.WithInstanceMethods;

public class TestCalculator2 {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		Calculator2 c2 = new Calculator2();
		Calculator2 c3 = new Calculator2();
		
		System.out.println("****c1 obj operations *****");
		int a=90;
		int b=40;
				
		c1.sum(a,b);
		c1.sub(a,b);
		c1.div(a,b);
		c1.mul(a,b);
		
		  a=900;
		  b=400;
		
		System.out.println("****c2 obj operations *****");
		c2.sum(a,b);
		c2.sub(a,b);
		c2.div(a,b);
		c2.mul(a,b);
		
	}
}
