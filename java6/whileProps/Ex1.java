package whileProps;

public class Ex1 {

	public static void main(String[] args) {
		// every for loop can be converted to while loop
		int i=1;  // init
		while(i <= 10) { // condition
			System.out.println("hello");
			
			i++;// increment
		}
			//  int i=1 ;  -> initialization   ( 1 time)
			//  i <=10;    -> condition        ( every time  before the for logic)
			//  i++        -> increment/decrement (every time after for logic)
		// for while loop condition is mandatory ; 
		// if you know the size/no of runs use for loops
		//if you dont know te size use the while loops
	}
}
