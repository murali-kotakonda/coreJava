package threads;

 /**
 * @author I335484
 *sleep example..
 */
class TestThreadSleep {
	public static void main(String[] args) {
		System.out.println("main: start");
		Thread th1 = new MyThreadSleep();
		th1.setName("my Thread1");
		
		Thread th2 = new MyThreadSleep();
		th2.setName("my Thread2");
		
		Thread th3 = new MyThreadSleep();
		th3.setName("my Thread3");
		
		th1.start();
		th2.start();
		th3.start();
		System.out.println("main: end");
	}
}
 
