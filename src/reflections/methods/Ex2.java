package reflections.methods;

import java.lang.reflect.*;

class Service {
	private void add(int x, int y) {
		System.out.println((x+y));
	}

	private void print() {
		System.out.println("welcome private function");
	}
}

public class Ex2 {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		Class c = Service.class;
		Object obj = c.newInstance();

		Method m = c.getDeclaredMethod("add", new Class[] { int.class ,int.class});
		m.setAccessible(true);
		m.invoke(obj, 4,5);

		Method m1 = c.getDeclaredMethod("print", null);
		m1.setAccessible(true);
		m1.invoke(obj, null);
	}
}
