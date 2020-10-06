package wrapper;

/**
  
  convert the int/float/long/double/boolean to string.
  solution:
  use String.valueOf() method
  
  
 */
public class TestConversion {
	public static void main(String[] args) {

		// input for primitive data types
		int intValue = 5;
		String intToStrValue = String.valueOf(intValue);
		
		float floatValue = 23f;
		String floatToStrValue = String.valueOf(floatValue);
		
		double doubleValue = 12D;
		String doubleToStrValue = String.valueOf(doubleValue);
		
		long longValue = 56l;
		String longToStrValue = String.valueOf(longValue);

		boolean found= true;
		String foundStr = String.valueOf(found);
		
		System.out.println(intToStrValue);
		System.out.println(floatToStrValue);
		System.out.println(doubleToStrValue);
		System.out.println(longToStrValue);
		

	}
}


/*
 Integer y1 = new Integer(900);  // Integer z= 899; 
		Float y2 = new Float(900.878787); // Float y2 = 900.878787; 
		Long y3 = new Long(90013131); //Long y3 = 90013131;
		Double y4 = new Double(900.1113131);
		Character y5 = new Character('c');
		Boolean y6 = new Boolean(true);
 * */
 