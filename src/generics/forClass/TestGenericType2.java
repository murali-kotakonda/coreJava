package generics.forClass;

import ds.collections.al.Person;

public class TestGenericType2 {

	public static void main(String[] args) {
		GenericType<String> data = new GenericType<String>();
		data.set("hello");
		String str = data.get();
		System.out.println(str);

		
		GenericType<Integer> data1 = new GenericType<Integer>();
		data1.set(67);
		int v = data1.get();
		System.out.println(v);
		
		GenericType<Float> data2 = new GenericType<Float>();
		data2.set(67.242424f);
		float m = data2.get();
		System.out.println(m);
 	}
}
