package threads;

class worker {

	synchronized static void printmsg(char a[]) // synchronized method
	{
		try {
			for (int i = 0; i < a.length; i++) {
				Thread.sleep(250);
				System.out.print(a[i]);
			}
		} catch (InterruptedException e) {
			/* blank */ }
		System.out.println();
	}

}

class worker1 {

	void printmsg(char a[]) // synchronized method
	{
		try {
			for (int i = 0; i < a.length; i++) {
				Thread.sleep(250);
				System.out.print(a[i]);
			}
		} catch (InterruptedException e) {
			/* blank */ }
		System.out.println();
	}

}

class mythreadav extends Thread {

	char msg[] = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', 't', 'h', 'i', 's', ' ', 'i', 's', ' ',
			'j', 'd' };
	static worker1 w1ob = new worker1();

//worker wrk = new worker();

	public void run() {
		System.out.println("This is thread : " + this.getName());
		synchronized (w1ob) {
			w1ob.printmsg(msg);
		}

//wrk.printmsg(msg);

	}

}

public class Practise2 {
	public static void main(String args[]) {
		mythreadav t1 = new mythreadav();
		mythreadav t2 = new mythreadav();

		t1.start();
		t2.start();
	}
}
