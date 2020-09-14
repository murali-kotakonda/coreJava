package wrapper;

/**
		// converting String to int 
		 use  Integer.parseInt() ; // Integer is wrapper class and parseInt() is method
		 Ex:
		 String intStr = "12";
		int fromInt = Integer.parseInt(intStr);
		
		
		// 	converting String to float 
		use Float.parseFloat()
		Ex:
		String floatstr = "134.00";
		float fromfloat = Float.parseFloat(floatstr);
		 
		// converting String to double 
		use   Double.parseDouble()
		Ex:
		String doubleStr = "346.00567";
		double fromdouble = Double.parseDouble(doubleStr);
		    
		// converting String to long 
		use Long.parseLong()
		Ex:
		String longStr = "346877997";
		long fromlong = Long.parseLong(longStr);
    
 */

public class TestConversion2 {
	public static void main(String[] args) {

		// converting String to int
		String data1 = "12";
		int data1Int = Integer.parseInt(data1);
    
		// 	converting String to float
		String data2 = "134.00";
		float data2Float = Float.parseFloat(data2);
        
		// converting String to double   
		String data3 = "346.00567";
		double doubleData3 = Double.parseDouble(data3);
		
		// converting String to long
		String data4 = "346877997";
		long longData4 = Long.parseLong(data4);
		
		String data5 = "true";
		boolean booleanData5= Boolean.parseBoolean(data5);

		System.out.println(data1Int);
		System.out.println(data2Float);
		System.out.println(doubleData3);
		System.out.println(longData4);
		System.out.println(booleanData5);
	}
}
