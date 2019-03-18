package annotatios.method;

import java.lang.reflect.Method;



// Accessing annotation
class TestCustomAnnotation1 {
	public static void main(String args[]) throws Exception {

		Person h = new Person();
		User user = new User();
		
		Method m1 = h.getClass().getMethod("printData");
		Method m2 = user.getClass().getMethod("printData");
		valid(m1);
		valid(m2);
	}

	private static void valid(Method m1) {
		Config manno = m1.getAnnotation(Config.class);
		int value = manno.value();
		if(value<18){
			System.out.println("valid -- "+value);
		}else{
			System.out.println("invaLID--"+value);
		}
		 
	}
}