package java8Features.lambdaAndForEach;

interface Controller {
	public void access(String name);
}


interface Action {
	public String process(String name);
}


interface MathCalc {
	int add(int a, int b);
}



public class TestLambdaAssignments {
public static void main(String[] args) {
	
	Controller c = (name) -> System.out.println("Hello "+ name);
	c.access("kumar");
	
	Controller c1 = (String name2) -> {
		System.out.println(name2.toUpperCase());
	};
	c1.access("Spring");

	Controller c2 = (String name) -> {
		System.out.println(name.toLowerCase());
	};
	c2.access("KIRAN");
	
	
	Action a = (name) -> {
		return "Mr/Mrs " + name;
	};
	String data = a.process("Ram");
	System.out.println(data);
	
	MathCalc m1 = (x,y)->{
		int sum = x+y;
		return sum;
	};
	int r= m1.add(20, 30);
	System.out.println(r);
	
	MathCalc m2 = (x,y)-> x+y;
	
	int r1= m2.add(80, 30);
	System.out.println(r1);
}
}


