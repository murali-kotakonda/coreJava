package java8Features.lambda;

public class TestL {
	public static void main(String[] args) {

		Service1 d1 = new Service1() {
			@Override
			public void process() {
				System.out.println("helo");
			}
		};
		d1.process();
		
		Service1 d2 =  () -> {
 				System.out.println("bye");
		};
		d2.process();
		
		Service1 d3 =  () -> {System.out.println("welcome");};
		d3.process();
		
	}
}

/*
  allows funtional programming.
  readable and concise code
  easier to use APIs and libs.
  enables support for parallel processings.
*/