package threads;

class TestMyThread3 {
	public static void main(String[] args) {
		System.out.println("main: start");
		
		Thread th = new Thread(new MyThread2());
		th.start();	
		
		System.out.println("main: end");
	}
}
// 2 threads are running in parallel. 
