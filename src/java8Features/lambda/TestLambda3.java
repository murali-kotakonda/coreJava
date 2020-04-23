package java8Features.lambda;

interface Calculator {
	int add(int a, int b);
}


public class TestLambda3 {
	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Calculator ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		
		// Multiple parameters with data type in lambda expression
		Calculator ad2 = (int a, int b) -> (a + b);
		System.out.println(ad2.add(100, 200));
		
		
		 // Lambda expression without return keyword.  
		Calculator ad3=(a,b)->(a+b);  
        System.out.println(ad3.add(10,20));  
          
        // Lambda expression with return keyword.    
        Calculator ad4=(a,b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
	}
}
