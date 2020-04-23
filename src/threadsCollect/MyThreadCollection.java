package threadsCollect;

import java.util.List;

public class MyThreadCollection extends Thread {

	public MyThreadCollection(List<String> list) {
		super();
		this.list = list;
	}

	List<String> list;

	@Override
	public void run() {
		synchronized (this) {
			if (list.isEmpty()) {
				System.out.println(Thread.currentThread() + "::list empty");
			}
			list.add(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread() + "Hi");
	}
}
