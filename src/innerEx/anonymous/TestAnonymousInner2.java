package innerEx.anonymous;

/**
Annonymous Inner class:
----------------------------------
is required only for abstract class and interface.


 */

abstract class PersonService {
	abstract void validate();
}


class Child1 extends PersonService{
	@Override
	void validate() {
		System.out.println("hello");		
	}
}

class Child2 extends PersonService{
	@Override
	void validate() {
		System.out.println("bye");		
	}
}


public class TestAnonymousInner2 {
	public static void main(String args[]) {
		PersonService sb = new Child1();
	    sb.validate();
	 
	 PersonService sb2 = new Child2();
	 sb2.validate();
	 
	}
}
