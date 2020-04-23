package java8Features.methodRef;

//ClassName::new  

interface Check {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.println("hello");
		System.out.print(msg);
	}
}

public class TestRef3 {
	public static void main(String[] args) {
		Check hello = Message::new;
		hello.getMessage("user1");
	}
}
