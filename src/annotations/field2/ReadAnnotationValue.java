package annotations.field2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReadAnnotationValue {

	public static int getDeclaredSize(String className,String fieldName) throws ClassNotFoundException, NoSuchFieldException {
		Class c = Class.forName(className);
		Field field = c.getDeclaredField(fieldName);
		Annotation[] annotations = field.getDeclaredAnnotations();

		int size = -1;
		for (Annotation annotation : annotations) {
			if (annotation instanceof Size) {
				Size myAnnotation = (Size) annotation;
				size = myAnnotation.value();
			}
		}
		return size;
	}
}


