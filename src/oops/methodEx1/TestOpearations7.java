package oops.methodEx1;

/**
 
Req: 
class1 : there is a method
from class2 we need to call the method.

 Steps:
 1.Create the object
 2.call the method using the object

 */
public class TestOpearations7 {
	public static void main(String[] args) {
		Opearations op = new Opearations(); //Create the object
		int a = op.add(30, 40);
		int b= op.add(300, 400);
		int c = op.add(3000, 4000);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
