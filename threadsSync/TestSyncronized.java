package threadsSync;

class Account {
	int bal = 600;
	public  void withdraw(int amt) {
			//synchronized(this){
			bal = bal-amt;
			System.out.println("amt = "+amt +"bal=" +bal);
		//}
	}
}

class Withdraw extends Thread {
	int amount;
	Account fobj;

	Withdraw(Account fp, int amount) {
		fobj = fp;
		this.amount = amount;
	}

	public void run() {
		fobj.withdraw(amount);
	}
}

public class TestSyncronized {
	public static void main(String[] args) {
		Account fnew = new Account();
		Withdraw ss = new Withdraw(fnew, 100);
		Withdraw ss1 = new Withdraw(fnew, 200);
		Withdraw ss2 = new Withdraw(fnew, 300);
		
		ss.start();
		ss1.start();
		ss2.start();
	}
}