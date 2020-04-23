package java8Features;


	public class FunctionalInterfaceExTest implements FunctionalInterfaceEx {

		@Override
		public void process(String str) {
			System.out.println("FunctionalInterfaceExTest - "+str);
		}
		
		public static void main(String[] args) {
			FunctionalInterfaceEx f = (str) ->  {
					System.out.println("hello" + str);
			};
			
			//FunctionalInterfaceEx f = (st) -> System.out.println("hello" + st);
			f.log("printing req data");
			f.process("kumar");
			FunctionalInterfaceEx.print("print cust info");
		}
		
		
	}
	
