package threads.Calculation1;

public class AddThread extends Thread {

	int n1;
	int n2;

	public AddThread(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
	/*	try {
			this.sleep(3000);
		} catch (InterruptedException e) {
		}
	*/	System.out.println("sum=" + (n1 + n2));
	}

}
