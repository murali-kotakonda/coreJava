package basics;

/**
 * @author I335484
 
 
 pre-increment , post-increment [ numbers/decimals]
 */
public class Increment {

	public static void main(String[] args) {
		
		int x =90;
		System.out.println(x);  //90
		
		
		int z = x; // assign the value of x to z    ====>  int z =90
		System.out.println(z); // 90 
		
		
		//post increment
		z = x++;  // assign the value of x to z ; then increment the value of x by 1
		// z = x
		// x = x+1 
		System.out.println(z); 
		System.out.println(x);
		
		
		//pre increment
		x =90; 
		z = ++x;   // increment the value of x by 1 assign the value of x to z ;
		// x = x+1 
		// z = x
		System.out.println(z); 
		System.out.println(x);
	}
}
