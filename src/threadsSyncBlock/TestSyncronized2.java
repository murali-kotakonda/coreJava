package threadsSyncBlock;

import java.util.ArrayList;
import java.util.List;

public class TestSyncronized2 {
	public static void main(String[] args) throws InterruptedException {
		Person person = new Person(5);
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 1; i <=10; i++) {
			Thread th = new MyThread(person);
			th.start();
			threads.add(th);
		}

		for (Thread t : threads) {
			t.join();
		}
		System.out.println(person.count);
	}
}