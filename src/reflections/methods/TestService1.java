package reflections.methods;

import java.lang.reflect.*;

/**
 	Call add() and print()  using Reflection.

	Can we call private method outside the class?
	Technically NO , but YES (using Reflections)
	
	
//Earlier
---------------------------------------------------------------------------------
//create obj
Service s = new Service(); 
//call method using obj
s.add(20,30);



//Using Reflections
-------------------------------------------------------------------------------------
//create obj
	Class c = Class.forName("reflections.Service");
  Service obj = (Service)c.newInstance();
  
//call method using obj 1.Get method obj for add() 2. and call method using invoke()
Method m = c.getDeclaredMethod("add", new Class[] { int.class ,int.class}); // mention method name and arguments
m.invoke(obj, 20,30);


 */




public class TestService1 {
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("reflections.methods.Service");
		Service obj = (Service)c.newInstance();

		Method m = c.getDeclaredMethod("add", new Class[] { int.class ,int.class});
		m.invoke(obj, 4,5);

	}
}
