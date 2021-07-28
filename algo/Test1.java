import java.util.Arrays;
import java.util.List;

/**
T1 1
T2 2
T3 3
T1 4
T2 5
T3 6
T1 7
T2 8
T3 9
T1 10
 */
public class Test1 {
	
	static List<String> list = Arrays.asList( "1","2","3" );
	static  int cur=0;
	
	static class Mythread extends Thread{
		Data data;
		boolean flag;
		String name;
		
		public Mythread(String name,Data data) {
			this.name = name;
			this.data = data;
		}
		
		public void run() {
			 if(name.equals(list.get(cur))) {
				 System.out.println(Thread.currentThread() + "  " + ( ++data.counter));
			 }
				synchronized (this) {
					cur = (cur + 1) % 2;
					 System.out.println("cur =" +cur);
				}
				if (data.counter < 10) {
					run();
				}
		}
	}
	
	static class Data{
		int counter;
	}
	
	public static void main(String[] args) {
		Integer counter =0; 
		///task print 1 to 10
		// use 3 threads
		Data d = new Data();
		
		Thread t1 = new Mythread("1",d);
		Thread t2 = new Mythread("2",d);
		Thread t3 = new Mythread("3",d);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
