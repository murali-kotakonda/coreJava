package java8Features.lambdaAndForEach;
public class TestLambda2 {
	public static void main(String[] args) {
	 
		Service s1 =  ()  -> {
			System.out.println("Hi");
		};
		s1.process();
		
		Service s2 = () ->{
			System.out.println("Hello");
		};
		s2.process();
		
		Service s3 = () -> {
			System.out.println("Welcome");
		};
		s3.process();
	}
}

 