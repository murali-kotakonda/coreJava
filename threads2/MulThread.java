package threads2;

public class MulThread extends Thread {

	int n1;
	int n2;

	public MulThread(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public void run() {
		System.out.println("mul=" + (n1 * n2));
	}

}
