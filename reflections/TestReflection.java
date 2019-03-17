package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import oops.composition.Address;

public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class  classObj = Class.forName("Address");
		Field[] fields = classObj.getFields();
	
		for(Field field: fields){
			System.out.println(field.getName());
		}
		Method[] methods = classObj.getMethods();
		for(Method method: methods){
			System.out.println(method.getName());
		}
		
		
		Address add = (Address)classObj.newInstance();
		add.setCountry("3131");
		System.out.println(add);
	}
}
