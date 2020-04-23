package ds.collections.arrays;

public class ArraysSort {
	public static void main(String[] args) {
		String[] names = { "Lila", "Mina", "Rina", "Hina" };
		int[] nums = { 1,6,8,4 };
		sort(nums);
		for (int n : nums) {
			System.out.println(n);
		}
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length;i++) {
			for (int j = i+1; j < array.length;j++) {
				if (array[i] > array[j]) 
					swap(array,i, j);		
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static String[] sort(String[] array) {
		String max = array[0];
		int l = array.length;
		int j = 0;
		for (int i = 1; i < l; i++) {
			// compareto() returns -1 if the first string comes before the second string
			if (max.compareTo(array[i]) == -1) {
				array[i] = max;
			}
		}
		return array;
	}
}
