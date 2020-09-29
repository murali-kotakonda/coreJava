package ds.collections.arrays;

/**
 Create a int array of size 5 and perform
 - Insert
 - Read by position
 - Read all
 */
public class TestInt {
	public static void main(String[] args) {
		
	// create int array of size 5
	int[] nums = new int[5];
	
	//Insert from position 0 TO position 4
	nums[0]=89;
	nums[1]=1;
	nums[2]=24;
	nums[3]=47;
	nums[4]=90;
			
	System.out.println("*********** Read by position ***************");
	//read by position
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	System.out.println(nums[3]);
	System.out.println(nums[4]);
	
	
	//Read all using enhanced for loop
	System.out.println("*********** Read all elements ***************");
	for( int x : nums) {
		System.out.println(x);
	}
}
}