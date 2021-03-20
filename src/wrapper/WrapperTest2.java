package wrapper;
 

/**
 wrapper obj  to primitive
 */
public class WrapperTest2 {
	public static void main(String[] args) {
		//create wrapper obj
		Integer a = new Integer(1313);
		Float b = new Float(12.114f);
		Long c = new Long(13131311);
		Double d = new Double(11313131d);
		Character e = new Character('c');
		Boolean f = new Boolean(true);
		
		// convert int obj  to int primitive
		int a1 = a.intValue();
		
		// convert float obj  to float primitive
		float b1 =  b.floatValue();
				
		// convert Long obj  to long primitive
		long c1 = c.longValue();
		
		// convert Double obj  to double primitive
		double d1 = d.doubleValue();
		
		// convert Character obj  to char primitive
		char e1 = e.charValue();
		
		// convert Boolean obj  to boolean primitive
		boolean f1 = f.booleanValue();
		
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		System.out.println(f1);
		
		 
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void check() {
		List<Integer> al = new ArrayList<>();
		
		int a=8;
		accept(a);
	}
	
	
	public void accept(Object o) {
		System.out.println(o);
	}
	
	
}
