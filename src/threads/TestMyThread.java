package threadsEx;

public class TestMyThread {
public static void main(String[] args) {
	
	System.out.println("Start");
	
	MyThread1  th1 = new MyThread1();
	th1.setName("my-Thread1");
	
	MyThread1  th2 = new MyThread1();
	th2.setName("my-Thread2");
	
	MyThread1  th3 = new MyThread1();
	th3.setName("my-Thread3");
	
	MyThread1  th4 = new MyThread1();
	th4.setName("my-Thread4");
	
	MyThread1  th5 = new MyThread1();
	th5.setName("my-Thread5");
	
	th1.start();
	th2.start();
	th3.start();
	th4.start();
	th5.start();
	
	System.out.println("end");
}
}
