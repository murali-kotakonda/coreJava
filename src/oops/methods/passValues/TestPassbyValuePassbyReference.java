package oops.methods.passValues;

public class TestPassbyValuePassbyReference {

	public static void main(String[] args) {
		//passing primitive variable
		int num1= 10;
		System.out.println("before calling:: num1-"+num1);
		updateValue(num1);
		System.out.println("after calling:: num1-"+num1);
		
		
		 //pass by refernce variable
		Person p = new Person();
		p.id=1234;
		p.age=23;
		System.out.println("before method calling :id= "+p.id);
		System.out.println("before method calling :age= "+p.age);
		
		updateObj(p);
		System.out.println("after method calling :id= "+p.id);
		System.out.println("before method calling :age= "+p.age); 
	}

	public static void updateObj(Person pObj) {
		pObj.id= 54321;
		pObj.age=45;
	}

	
	
	
	
	
	
	
	
	
	
	
	public static void updateValue(int num) {
		num = 50;
	}


}
