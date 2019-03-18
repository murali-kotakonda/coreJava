package annotatios;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodInfoTest {

	public static void main(String[] args) {
		try {
			for (Method method : MethodInfoTest.class.getClassLoader()
					.loadClass(("annotatios.MethodInfoUse")).getMethods()) {
				if (method.isAnnotationPresent(MethodInfo.class)) {
					try {
						for (Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method '" + method + "' : " + anno);
						}
						MethodInfo methodAnno = method.getAnnotation(annotatios.MethodInfo.class);
						if (methodAnno.revision() == 1) {
							System.out.println("Method with revision no 1 = " + method);
						}

					} catch (Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}