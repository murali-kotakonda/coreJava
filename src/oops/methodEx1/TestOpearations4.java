package oops.methodEx1;

/**
 
Req: 
class1 : there is a method
from class2 we need to call the method.

 Steps:
 1.Create the object
 2.call the method using the object

 */
public class TestOpearations4 {
	public static void main(String[] args) {
		Opearations op = new Opearations(); //Create the object
		op.sum(20, 30);
		op.sum(12, 20);
	}
}
