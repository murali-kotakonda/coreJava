package threadsSyncBlock;

import java.util.ArrayList;
import java.util.List;



/**
 
 Req: 
 a person obj has a count.
 share the same person obj to 10 different threads.
 every Thread has to add +5 to the count for the person obj at the same time.
  
 
 ex: 
 count initial value is 5
 count final value ==========>  55
 
 */

public class TestSyncronized2 {
	public static void main(String[] args) throws InterruptedException {
		Person person = new Person(5);// create Person obj with 5 as inital value
		
		//print inital count
		System.out.println("inital count =" +person.count);
		
		List<Thread> threads = new ArrayList<Thread>();
		
		//create 10 threads
		for (int i = 1; i <=10; i++) {
			Thread th = new MyThread(person);
			th.start();
			threads.add(th);
		}
	
		//main thread has to wait 
		for (Thread t : threads) {
			t.join();
		}
		
		//print final count
		System.out.println("final count =" +person.count);
	}
}