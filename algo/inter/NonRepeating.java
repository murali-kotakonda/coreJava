package inter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//Time Complexity: O(n).
public class NonRepeating {
	private static void withHashMap(String input) {
		Map<Character, Integer> countsByChar = new LinkedHashMap<>();
		// converting string to char array
		char[] chars = input.toCharArray();
		for (Character c : chars) {
			Integer currCount = countsByChar.get(c);
			if (currCount == null) {
				countsByChar.put(c, 1);
			} else {
				countsByChar.put(c, currCount + 1);
			}
		}

		boolean found = false;
		for (Entry<Character, Integer> entry : countsByChar.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non repeated char : " + entry.getKey());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No non repeating char");
		}
	}

	static int firstNonRepeating(String str) {
		int NO_OF_CHARS = 256;

		int arr[] = new int[NO_OF_CHARS];
		for (int i = 0; i < NO_OF_CHARS; i++)
			arr[i] = -1;

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == -1)
				arr[str.charAt(i)] = i;
			else
				arr[str.charAt(i)] = -2;
		}

		int res = Integer.MAX_VALUE;
		for (int i = 0; i < NO_OF_CHARS; i++)
			if (arr[i] >= 0)
				res = Math.min(res, arr[i]);

		return res;
	}

	public static void main(String args[]) {
		String str = "swiss";
		int index = firstNonRepeating(str);
		if (index == Integer.MAX_VALUE)
			System.out.print("Either all characters are " + "repeating or string is empty");
		else
			System.out.print("First non-repeating character" + " is " + str.charAt(index));
		
		withHashMap(str);
	}
}
