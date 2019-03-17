package wrapperConversions;

public class TestConversion {
public static void main(String[] args) {
	
	//input for primitive data types
	int intValue= 5;
	float floatValue= 23f;
	double doubleValue= 12D;
	long longValue = 56l;
	
	//converting to string
	String  intToStrValue= String.valueOf(intValue);
	String floatToStrValue=  String.valueOf(floatValue);
	String doubleToStrValue=  String.valueOf(doubleValue);
	String longToStrValue =  String.valueOf(longValue);
	
	System.out.println("To String ="+intToStrValue+"_"+floatToStrValue+"_"+doubleToStrValue+"_"+longToStrValue);
	
	
	
	//converting String to primitive datatypes
	String intStr= "12";
	String floatstr=  "134.00";
	String doubleStr=  "346.00567";
	String longStr =    "346877997";
	
	int fromInt = Integer.parseInt(intStr);
	float fromfloat = Float.parseFloat(floatstr);
	double fromdouble = Double.parseDouble(doubleStr);
	long fromlong = Long.parseLong(longStr);
	
	
	System.out.println("To data types  ="+fromInt+
			"_"+fromfloat+"_"+
			fromdouble+"_"+fromlong);
	
	
}
}
