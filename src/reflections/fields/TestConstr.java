package reflections.fields;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import reflections.Emp;

public class TestConstr {
	public static void main (String[] args) {
		// Create Class object for Emp.class 
		Class classObj=Emp.class;

		// Get all the constructor information in the Constructor array
		Constructor[] constList = classObj.getDeclaredConstructors();
		
		for (Constructor constructor : constList) {
			// Print all name of each constructor
			System.out.println("Constrcutor name : "+constructor.getName());
			constructor.setAccessible(true);
			//Get and print access modifiers of each constructor 
			int modifiers= constructor.getModifiers(); 
			System.out.println ("Constrctor modifier : "+Modifier.toString(modifiers));
			
			// Get and print parameter types 
			Class[] constrParams=constructor.getParametdterTypes();
			System.out.print ("Constrctor parameter types :"); 
			for (Class class1 : constrParams) { 
				System.out.println(class1.getName() +" ");
			}
			System. out.println();

			// Get and print exception thrown by constructors
			Class[] exceptionList=constructor.getExceptionTypes();
			System.out.println("Exception thrown by constructors :"); 
			for (Class class1 : exceptionList) { 
				System.out.println(class1.getName() +" ");
			} 
			System.out.println();
			System.out.println("*******************************************");
		}
	}
}
