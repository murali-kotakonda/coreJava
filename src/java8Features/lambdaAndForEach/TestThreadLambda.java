package java8Features.lambdaAndForEach;

public class TestThreadLambda {

	 public static void main(String[] args) throws InterruptedException {
		System.out.println("main : start");
		
		Runnable r1 = () ->{
			System.out.println("thread1 ");
		};
		Thread  th1 = new Thread(r1);

		Runnable r2 = () ->{
			System.out.println(Thread.currentThread()+"thread1 ");
		};
		
		Thread  th2 = new Thread(r2);
		
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread()+"running thread ");
			}
		};
		
		Thread  th3 = new Thread(r3);
		
		th1.start();
		th2.start();
		System.out.println("main :end");
	}

}
