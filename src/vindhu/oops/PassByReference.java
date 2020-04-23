package vindhu.oops;

public class PassByReference {
	public static void main(String[] args) {
		Product p1=new Product("mobile",5000d,"sony",1000d);
		p1.show();
		change(p1);
		p1.show();
		
	}

	private static void change(Product p1) {
		Product p2=p1;
		p2.name="laptop";
		p2.cost=50000d;
		p2.brand="dell";
		p2.discount=2000d;
		
		
	}
}
