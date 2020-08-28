package ds.collections.arrays;

public class TestString2 {
	public static void main(String[] args) {
		
		String[] names = {"kumar" ,"shyam" ,"ram" ,  "raj" , "nandini" ,  "teju"} ;
		
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



//read all for loop
/*
 * System.out.println("Print ALL using for loop"); for (int i = 0; i < 5; i++) {
 * System.out.println(names[i]); }
 */