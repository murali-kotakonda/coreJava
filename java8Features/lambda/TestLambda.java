package java8Features.lambda;

interface Service1 {
	public void process();
}

public class TestLambda {
	
	/*
	 * Lambda expressions better way to represent one method interface using an expression. 
	 *It is very useful in 
	 *- collection library. It helps to iterate, filter and extract data from collection.
      - provide the implementation of an interface which has functional interface.
      - we don't need to define the method again for providing the implementation. we just write the implementation code.

	- Java lambda expression is treated as a function, so compiler does not create .class file.

	Functional Interface
      	Lambda expression provides implementation of functional interface. 

	Adv:
		To provide the implementation of Functional interface. 
		Less coding.
		
		*
		*usage: (argument-list) -> {body}  
		*
		* */
	
		public static void main(String[] args) {
			// without lambda, Drawable implementation using anonymous class
			Service1 d = new Service1() {
				public void process() {
					System.out.println("Hello user1:: ");
				}
			};
			
			
			//with lambda No Parameter
			Service1 d2=()->{  
	            System.out.println("Hello user2::  ");  
	        }; 
	        
	    	Service1 d23=()->{  
	            System.out.println("Hello user3::  ");  
	        }; 
	        
	    	d.process();    
	        d2.process(); 
		}
}
