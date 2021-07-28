package algo;

public class Anagram {
	public static void main(String[] args) {

	}

	static boolean isAnagram(String a, String b) {

		// Complete the function
		java.util.Map<Character, Integer> map1 = new java.util.HashMap<>();

		for (char ch : a.toLowerCase().toCharArray()) {
			Integer count = map1.getOrDefault(ch, 0);
			map1.put(ch, ++count);
		}

		int sum = 0;
		java.util.Map<Character, Integer> map2 = new java.util.HashMap<>();
		for (char ch : b.toLowerCase().toCharArray()) {
			
			Integer count = map2.getOrDefault(ch, 0);
			map2.put(ch, ++count);
		}

		return map1.equals(map2);

	}

}
