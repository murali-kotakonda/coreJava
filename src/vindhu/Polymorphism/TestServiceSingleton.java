package vindhu.Polymorphism;

public class TestServiceSingleton {
	public static void main(String[] args) {
		ServiceSingleton s1=ServiceSingleton.getObj();
		ServiceSingleton s2=ServiceSingleton.getObj();
		ServiceSingleton s3=ServiceSingleton.getObj();
		ServiceSingleton s4=ServiceSingleton.getObj();
		ServiceSingleton s5=ServiceSingleton.getObj();
	}
}
