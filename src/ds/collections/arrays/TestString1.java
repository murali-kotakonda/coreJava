package ds.collections.arrays;

/**
 Create a string array of size 6 and perform
 - Insert
 - Read by position
 - Read all
 
 */
public class TestString1 {
	public static void main(String[] args) {
		
		String[] names = new String[6]; // names is array of size 6
		
		//add multiples names inside the array
		names[0] = "kumar";
		names[1] = "shyam";
		names[2] = "ram";
		names[3] = "raj";
		names[4] = "nandini";
		names[5] = "teju";
		
		//read by position
		System.out.println("*********** Read by position ***************");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		
		//Read all using enhanced for loop
		System.out.println("*********** Read all elements ***************");
		for( String n: names) {
			System.out.println(n);
		}
		 
	}
}