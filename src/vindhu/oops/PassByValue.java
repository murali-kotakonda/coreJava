package vindhu.oops;

public class PassByValue {
	public static void main(String[] args) {
		int x=89;
		System.out.println(x);
		
		change(x);
		
		System.out.println(x);
	}

	private static void change(int y) {
		y=90;
	}
	
}
// this code will applicable for (int, long ,float, double,byte) except string
//if we pass a primitive datatype to a function and function modifies it  it will not impact the caller
//if we pass an object to a function and the funtion modifies the object it will impact the caller