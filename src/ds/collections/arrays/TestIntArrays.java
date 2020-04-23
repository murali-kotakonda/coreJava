package ds.collections.arrays;

public class TestIntArrays {
	public static void main(String[] args) {
		
	int[] numbers = new int[5];

	//insert the elements
	numbers[0]= 12;
	numbers[1]= 1;
	numbers[2]= 17;
	numbers[3]= 125;
	numbers[4]= 16;


	//read elements
	System.out.println(numbers[0]);
	System.out.println(numbers[1]);
	System.out.println(numbers[2]);
	System.out.println(numbers[3]);
	System.out.println(numbers[4]);

	//read all for loop
	System.out.println("Print ALL using for loop");
	for (int i = 0; i < 5; i++) {
				System.out.println(numbers[i]);
	}

	//read all enhances for loop
	System.out.println("Print ALL using enhanced for  loop");
	for(int p : numbers){
				System.out.println(p);
	}

}
}