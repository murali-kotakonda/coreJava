package reflections.fields;

import java.lang.reflect.Field;

import reflections.Emp;

public class TestFields {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Class classEmp = TestFields.class;
		Field[] fields = classEmp.getDeclaredFields();
		Emp e = new Emp();
		for (Field field : fields) {
			System.out.println("Variable name : " + field.getName());
			System.out.println("Datatypes of the variable :" + field.getType());

			// int accessModifer = field.getModifiers();
			// System.out.println("Access Modifiers of the variable : " +
			// Modifier.toString(accessModifer));
			System.out.println("Value of the variable : " + field.get(e));
			System.out.println();
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		}
	}
}