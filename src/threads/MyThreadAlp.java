package threads;

//thread banav vani 2 methods : 
//1. Implementing the 'Runnable' Interface
//2. Extending the 'Thread' class  <-- Illustrated in this program

//2. Extending the 'Thread' class
//create a new class that extends the 'Thread' class
//override the run()
//instantiate and call start()

public class MyThreadAlp extends Thread {

	public void run() {
		String data = "Java is a programming language";
			int i;
			for (char ch:  data.toCharArray()) {
				System.out.print(ch);
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		System.out.println();
	}
	
	public static void main(String args[]) {
		Thread t1 = new MyThreadAlp();
		t1.start();
	}
}

