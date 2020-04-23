package oops.methodEx1;

public class TestOperations1 {

	public static void main(String[] args) {
		Operations1 op = new Operations1();
		op.show();
		
		String str = op.getMsg();
		System.out.println(str);

		int v = op.getInt();
		System.out.println(v);
		
		float v2= op.getData();
		System.out.println(v2);
		
		int a= 20;
		int b=90;
		
		op.sum(a,b);
		
		int z= op.getSum(60, 70);
		System.out.println(z);
		
		
	}
	
}
