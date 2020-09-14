package java8Features.Funtional;


	public class ServiceTest2   {

		public static void main(String[] args) {
			Service f = (str) ->  {
					System.out.println("hello" + str);
			};
			
			//FunctionalInterfaceEx f = (st) -> System.out.println("hello" + st);
			f.process("kumar");
		}
		
		
	}
	
