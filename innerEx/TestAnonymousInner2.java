package innerEx;

abstract class PersonService {
	abstract void print();
}



class Child1 extends PersonService{
	@Override
	void print() {
		System.out.println("hello");		
	}
}

class Child2 extends PersonService{
	@Override
	void print() {
		System.out.println("bye");		
	}
}

public class TestAnonymousInner2 {
	public static void main(String args[]) {
		PersonService sb = new Child1();
	 sb.print();
	 
	 PersonService sb2 = new Child2();
	 sb2.print();
	 
	}
}
