package passValue;

public class TestPassByValue {
	public static void main(String[] args) {
		int x= 10;
		
		System.out.println(x);

		modify(x);
		
		System.out.println(x);
	}
	
	private static void modify(int num){
		num = 90;
	}
	
	
	
	
	/*
	  int x= 90;
	  System.out.println(x);
	  
	  int y =x;
	  System.out.println(y);
	  
	  y =45;
	  System.out.println(x);
	  System.out.println(y);
	  
	 */
}
