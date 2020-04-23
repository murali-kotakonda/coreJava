package threadsSyncBlock;

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
	int bal = 600;
	public  void withdraw(int amt) {
			synchronized(this){
			bal = bal-amt;
			System.out.println("amt withdraw = "+amt +"final bal=" +bal);
		}
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

