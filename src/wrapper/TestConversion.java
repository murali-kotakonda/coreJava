package wrapper;

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

		
		System.out.println(
				"To String =" + intToStrValue + "_" + floatToStrValue + "_" + doubleToStrValue + "_" + longToStrValue);

		 //any data received from third party is considered as string
		// converting String to int
		String intStr = "12";
		int fromInt = Integer.parseInt(intStr);
		
    
		// 	converting String to float
		String floatstr = "134.00";
		float fromfloat = Float.parseFloat(floatstr);
				
        
		// converting String to double   
		String doubleStr = "346.00567";
		double fromdouble = Double.parseDouble(doubleStr);
		
    
		// converting String to long
		String longStr = "346877997";
		long fromlong = Long.parseLong(longStr);

		System.out.println("To data types  =" + fromInt + "_" + fromfloat + "_" + fromdouble + "_" + fromlong);
	}
}
