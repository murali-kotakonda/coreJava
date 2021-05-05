package java8Features.lambdaAndForEach;

interface Service3 {
	public String process(String name);
}

// lambda with a return
public class TestLambda5 {
	public static void main(String[] args) {
		Service3 service2 = new Service3() {
			public String process(String name) {
				return "hello "+name;
			}
		};
		String output = service2.process("user1");
		System.out.println(output);


		Service3 service3 = (name)-> {
				return "hello "+name;
		};
		
		System.out.println(service3.process("user1"));
		
		Service3 service4 = (name)->  "hello "+name;
		System.out.println(service4.process("user1"));
		
		Service3 service5 = name->  "hello "+name;
		System.out.println(service4.process("user1"));
/*
		
		// Lambda expression with single parameter.
		Service2 s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.process("User1"));

		// You can omit function parentheses
		Service2 s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.process("User2"));
*/	}
}