package java8Features.Funtional;

import java.io.IOException;

/**
	 -An Interface that contains exactly one abstract method is known as functional interface.
	 -We need to use annotation @FunctionalInterface for specifing the Functional interface.
	 -helps to achieve functional programming approach.
	 */


	@FunctionalInterface
	public interface Service {

		void process(String str) throws IOException;
		
	}
	
	class A implements Service{
		
		private int i;
		
		private void set(A a) {
			a.i =20;
		}

		@Override
		public void process(String str)  {
			// TODO Auto-generated method stub
			Runnable b = new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
			};
			Thread t = new Thread(b,"");
		}
	}
	
	
	
	
	
	
	
