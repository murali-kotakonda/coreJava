package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodInfoTest {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		for (Method method : Service.class.getMethods()) {
			if (method.isAnnotationPresent(MethodInfo.class)) {

				for (Annotation anno : method.getDeclaredAnnotations()) {
					System.out.println("Annotation in Method '" + method.getName() + "' : " + anno);
				}

			}
		}
	}

}