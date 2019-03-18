package java8Features;

	//The concept of default method is used to define a method with default implementation
	
	public interface InterfaceWithDefaultEx {

		void process(String str);
		
		void process1(String str);

		default void log(String str) {
			System.out.println("I1 logging::" + str);
		}

		static void print(String str) {
			System.out.println("Printing " + str);
		}

	}
	
