package oops.methodEx;

public class TestOperations {

	public static void main(String[] args) {
		Operations op = new Operations();
		
		op.show();
		
		int a= 20;
		int b=90;
		
		op.sum(a,b);
		
		int res = op.getSum(60, 70);
		System.out.println(res);
		
		String str = op.getMsg();
		System.out.println(str);
	}
}
