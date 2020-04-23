package arrays;

public class Ex1 {
	public static void main(String[] args) {
		//array hold values for similar datatypes
		//specify the size during the array creation.
		//size cannot be increased or decreased. 
		String [] names= new String[5];

		//Array supports index based operation.
		
		//add element
		names[0] = "user1";
		names[1] = "user2";
		names[2] = "user3";
		names[3] = "user4";
		
		//read an element
		System.out.println(names[3]);
		
		//update element
		names[3] = "user44444";
		System.out.println(names[3]);
		
		//delete element ??? NO
		names[1] = null;
		
		System.out.println("******print all******");
		//read all elements
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//array has 10k elements
		//req: fetch element at 5000 position
		System.out.println(names[4999]);
		
		//array search by position : 1 search
		
		
		
	}
}
