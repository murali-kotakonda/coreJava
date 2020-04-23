package threadsSyncMethod;

public class TestSyncronized {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("th1");
		MyThread t2 = new MyThread("th2");
		MyThread t3 = new MyThread("th3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
 