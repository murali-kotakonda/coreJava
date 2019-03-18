package java8Features;


	public class FunctionalInterfaceExTest implements FunctionalInterfaceEx {

		@Override
		public void process(String str) {
			System.out.println("FunctionalInterfaceExTest - "+str);
		}
		
		public static void main(String[] args) {
			FunctionalInterfaceEx obj = new FunctionalInterfaceExTest();
			obj.process("test");
		}
		
	}
	
