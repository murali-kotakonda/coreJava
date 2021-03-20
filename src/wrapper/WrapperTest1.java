package wrapper;

/**
 primitive to wrapper obj
 */
public class WrapperTest1 {
	public static void main(String[] args) {
		int a = 90;
		Integer a1 = new Integer(a);
		
		float b = 90;
		Float b1 = new Float(a);
		
		
		long c = 90;
		Long c1 = new Long(a);
		
		
		double d = 90;
		Double d1 = new Double(a);
		
		
		boolean e = true;
		Boolean e1 = new Boolean(e);
		
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		
		
		
	}
	}