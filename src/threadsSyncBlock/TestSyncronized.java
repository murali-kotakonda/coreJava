package threadsSyncBlock;


/**
 Req:
account obj is shared across multiple threds.
every thred is performing withdraw on same account obj.
ensure the data consistency.


 */
public class TestSyncronized {
	public static void main(String[] args) {
		Account account = new Account();
		Withdraw ss = new Withdraw(account, 100);
		Withdraw ss1 = new Withdraw(account, 200);
		Withdraw ss2 = new Withdraw(account, 300);
		
		ss.start();
		ss1.start();
		ss2.start();
	}
}

class Account {
	int bal = 6000;
	public  void withdraw(int amt) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bal = bal-amt;
			System.out.println("amt withdraw = "+amt +"final bal=" +bal);
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

