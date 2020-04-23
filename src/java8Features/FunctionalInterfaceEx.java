package java8Features;

	// An Interface that contains exactly one abstract method is known as functional interface.
	// It can have any number of default, static methods but can contain only one abstract method.
	//	helps to achieve functional programming approach.


	@FunctionalInterface
	public interface FunctionalInterfaceEx {

		void process(String str);
		
		default void log(String str) {
			System.out.println("I1 logging::" + str);
		}

		static void print(String str) {
			System.out.println("Printing " + str);
		}

	}
	
	
	
	
	
	
	
	
