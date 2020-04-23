package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import oops.composition.Address;

/**
 * @author I335484
 The Reflection API is mainly used in:

IDE (Integrated Development Environment) e.g. Eclipse, MyEclipse, NetBeans etc.
Debugger
Test Tools  
 
 */
public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//get the class object
		Class  classObj = Class.forName("reflections.Emp");
		Field[] fields = classObj.getDeclaredFields();
	
		//get the field objs for the instance variables
		for(Field field: fields){
			System.out.println(field.getName());
		}
		
		//get the method objs for the methods
		Method[] methods = classObj.getMethods();
		for(Method method: methods){
			System.out.println(method.getName());
		}
		
		Object obj = classObj.newInstance();
		
		
		
		Address add = (Address)obj;
		add.setCountry("3131");
		System.out.println(add);
	}
}
