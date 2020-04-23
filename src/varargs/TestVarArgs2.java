package varargs;

import java.util.List;

public class TestVarArgs2 {
	public static void main(String[] args) {
		System.out.println(getSum(12, 13));
		System.out.println(getSum(1,2,3,4,5,6,7,8));
		System.out.println(getSum(12));
		System.out.println(getSum(23,24,25,1,1,1,1,1,4,1,1,1,24,1));
		System.out.println(getSum(12, 1));
		
	}
	
	public static int getSum(int... data){
		int sum= 0;
		for(int v: data){
			sum = sum+v;
		}
		return sum;
	}
	
	
	public static int getSum1(String str, int... data){
		System.out.println(str);
		int sum= 0;
		for(int v: data){
			sum = sum+v;
		}
		return sum;
	}
	

	/**
	 * @param str
	 * @return
	 * 
	 * input any number of lists and return the merge list
	 */
	public static int getSum1(List<String>... str){
		System.out.println(str);
		int sum= 0;
		return sum;
	}
}
