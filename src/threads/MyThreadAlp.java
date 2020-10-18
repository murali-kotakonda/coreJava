package threads;

/**
 Req:
 Display every char in a string with a delay of 250 ms
 
 */
public class MyThreadAlp extends Thread {
	
	public  void run() {
		String data = "Java is a programming language";
		for (char ch:  data.toCharArray()) {
			System.out.print(ch);
			try {
				Thread.sleep(250);
			} catch ( Exception e) {
			}
		}
	}
	
	public static void main(String args[]) {
		MyThreadAlp  th1 = new MyThreadAlp();
		th1.start();
	}
	
}

