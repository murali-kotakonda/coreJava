package algo;

public class Rotate {

	// function that rotates s towards left by d
	static String leftrotate(String str, int d) {
		String ans = str.substring(d) + str.substring(0, d);
		return ans;
	}

	// function that rotates s towards right by d
	static String rightrotate(String str, int d) {
		return leftrotate(str, str.length() - d);
	}

	public static void main(String args[]) {
		String str1 = "ABCD";
		System.out.println(leftrotate(str1, 1));

		String str2 = "efgh";
		System.out.println(rightrotate(str2, 2));
	}
}
