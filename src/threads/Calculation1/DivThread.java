package threads.Calculation1;


public class DivThread extends Thread {

	int n1;
	int n2;

	public DivThread(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public void run() {
		System.out.println("div=" + (n1 / n2));
	}

}
