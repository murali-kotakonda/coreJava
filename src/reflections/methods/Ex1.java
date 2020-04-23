package reflections.methods;

import java.lang.reflect.*;

class Helper {
	public void add(int x, int y) {
		System.out.println((x+y));
	}

	public void print() {
		System.out.println("welcome public function");
	}
}

public class Ex1 {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		Class c = Helper.class;
		Object obj = c.newInstance();

		Method m = c.getDeclaredMethod("add", new Class[] { int.class ,int.class});
		m.invoke(obj, 4,5);

		Method m1 = c.getDeclaredMethod("print", null);
		m1.invoke(obj, null);
	}
}
