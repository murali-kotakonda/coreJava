package java8Features.Funtional;

	/**
	 An Interface that contains exactly one abstract method is known as functional interface.
	 We need to use annotation @FunctionalInterface for specifing the Functional interface.
	 helps to achieve functional programming approach.
	 */


	@FunctionalInterface
	public interface Service {

		void process(String str);
		
	}
	
	
	
	
	
	
	
	
