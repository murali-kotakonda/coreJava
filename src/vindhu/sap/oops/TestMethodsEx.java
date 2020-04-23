package vindhu.sap.oops;

public class TestMethodsEx {

	public static void main(String[] args) {
		MethodsEx obj = new MethodsEx();
		
		obj.m1();
		
		int userAge= 18;
		String userName ="shyam";
		obj.printData(userName, userAge);
		
		int res = obj.sum(12, 13);
		System.out.println(res);
	}
}
