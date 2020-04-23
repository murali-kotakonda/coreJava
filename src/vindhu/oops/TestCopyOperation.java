package vindhu.oops;

public class TestCopyOperation {
	public static void main(String[] args) {
		Product p1=new Product("mobile",50000,"apple",1000);
		Product p3;//variable declaration
		p3=new Product();//object creation
		Product p2=p1;  //the new object is not created and both p1 and p2 are referred to same data
		p2.name="laptop";
		p2.cost=80000;
		p2.brand="samsung";
		p2.discount=1000;
		p1.show();
		p2.show();
	}
}
//p1 and p2 are the local(reference) variables for main method these are in the stack and the data exits in heap memory