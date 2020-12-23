package basics.loopsEx;

import java.util.Scanner;

/**
 Take the names as input continuosly 
if the input value is "end"
then stop taking the inputs and print what are the names entered so far

Input:
-----------------
Enter name::
user1
Enter name::
kumar
Enter name::
raju
Enter name::
ramana
Enter name::
end

Output:
-------------------
names == user1 kumar raju ramana

use for loop when we know the size ( no of iterations)
use for while or do while when we dont know the size

 */
public class Ex51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		String input ="";
		
		do {
			result = result + " " +input;
			System.out.println("Enter name::");
			input = sc.next();
		}while (!input.equals("end"));
		
		System.out.println("names ==" + result);
	}
}

/* 

while: check condition before the block
check the condition,  if condtion is satisfied then execute the block

do while :check condition after the block
execute the block and then check the condition, if the condition is true loop will continue

*/
