package oops.passValues;

public class TestPassByValue {
	public static void main(String[] args) {
		int x= 10;
		
		modify(x);
		
		System.out.println(x);
	}
	
	private static void modify(int num){
		num = 90;
	}
}
