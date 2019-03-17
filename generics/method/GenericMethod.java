package generics.method;

public class GenericMethod {

	public static void main(String args[]) {
	      // Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      String[] strArray = { "hyd","banglr","chenai" };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array
	      
	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	      
	      printArray(strArray);
	   }

	public static < T > void printArray( T[] inputArray ) {
	      for(T element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }
	
	
	}