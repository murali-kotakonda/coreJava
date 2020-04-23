package reflections.methods;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import reflections.Emp;

public class Ex11 {
	public static void main(String[] args) {
		Class clazObj = Emp.class;

		Method[] methods = clazObj.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println("Name of the method : " + method.getName());

			System.out.println("Return type of the method : " + method.getReturnType());

			int modifierList = method.getModifiers();
			System.out.println("Method access modifiers : " + Modifier.toString(modifierList));

			Class[] paramList = method.getParameterTypes();
			System.out.print("Method parameter types : ");
			for (Class class1 : paramList) {
				System.out.println(class1.getName() + " ");
			}
			System.out.println();

			Class[] guru99ExceptionList = method.getExceptionTypes();
			System.out.print("Excpetion thrown by method :");
			for (Class class1 : guru99ExceptionList) {
				System.out.println(class1.getName() + " ");
			}
			System.out.println();
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");

		}
	}
}
