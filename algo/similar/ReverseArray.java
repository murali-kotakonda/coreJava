package similar;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] input = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20,21,-1};
		
		int length = input.length;
		
		for(int i=0; i<length/2; i++) {
			input[i] =  input[i] + input[length-1-i];// 6
			input[length-1-i] = input[i] -input[length-1-i];
			input[i] = input[i] -input[length-1-i];
		}
			
		System.out.println(Arrays.toString(input));
		 
	}
}
