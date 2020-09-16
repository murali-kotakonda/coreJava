package threadsSyncBlock;

public class MyThreadLambda {
public static void main(String[] args) throws InterruptedException {
	Person person = new Person(5);
	
	Runnable r = () ->{
		try {
			Thread.sleep(7000);
			person.count = person.count + 5;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	};
	
	Thread th1 = new MyThread(person);
	Thread th2 = new MyThread(person);
	Thread th3 = new MyThread(person);
	Thread th4 = new MyThread(person);
	
	th1.start();
	th2.start();
	th3.start();
	th4.start();
	
	th1.join();
	th2.join();
	th3.join();
	th4.join();
	
	//print final count
	System.out.println("final count =" +person.count);
}
}
