package threads1;

import java.util.ArrayList;
import java.util.List;
public class MyThreadCollectionTest{
	
public static void main(String[] args) {
	List<String> threads = 
			new ArrayList<String>();
	System.out.println(Thread.currentThread()+"::hi");
	for(int i=1;i<=10;i++){
		Thread th1 = getThread("Thread"+i,i, threads);
		th1.start();
	}
	System.out.println(Thread.currentThread()+"::hi");
	
	for(String thName: threads){
		System.out.println(thName);
	}
}

private static Thread getThread(
		String name, int pri, List<String> threads) {
	Thread th1 = new MyThreadCollection(threads);
	th1.setName(name);
	th1.setPriority(pri);
	return th1;
}

}
