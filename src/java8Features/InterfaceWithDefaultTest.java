package java8Features;

public class InterfaceWithDefaultTest implements InterfaceWithDefaultEx {
	public void process(String msg) {
		System.out.println("process - "+msg);
	}

	public static void main(String[] args) {
		InterfaceWithDefaultEx obj = new InterfaceWithDefaultTest();
		obj.process("Hello there");
		obj.process1("Hello there");
		obj.log("error::");
		InterfaceWithDefaultEx.print("error::");
	}

	@Override
	public void process1(String str) {
		System.out.println("process1 - "+str);
	}
}