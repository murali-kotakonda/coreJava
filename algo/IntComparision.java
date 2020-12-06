

public class IntComparision {
	public static void main(String[] args) {
		Integer a = 100;
		Integer b = 100;
		
		if(a==b) {
			System.out.println("same");
		}else {
			System.out.println("dif");
		}
		
		//If == operator is used to check for any values 
		//between -128 to 127 then it returns true
		
		Integer c = 200;
		Integer d = 200;
		if(c==d) {
			System.out.println("same");
		}else {
			System.out.println("dif");
		}
	}

}
