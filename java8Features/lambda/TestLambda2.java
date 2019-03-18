package java8Features.lambda;

interface Service2 {
	public String process(String name);
}


public class TestLambda2 {
	public static void main(String[] args) {
		Service2 service2 = new Service2() {
			public String process(String name) {
				return "hello "+name;
			}
		};
		String output = service2.process("user1");
		System.out.println(output);


		Service2 service3 = (name)-> {
				return "hello "+name;
		};

		Service2 service4 = (name)->  "hello "+name;
		Service2 service5 = name->  "hello "+name;


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