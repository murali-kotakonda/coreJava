package oops.atmOperations;


/*
 * when we use an ArrayList of user made type we have to create an arraylist of
 * that type first. Then we need to create an object of that user made class.
 *  Then we can call the add() on the arraylist object to add the user made type 
 * to the arraylist.
 * 
 balance = 10000

ATM Opeartions:
----------------------
1.deposit
2.withdraw
3.see the balance
4.show transactn history
5.exit

Enter option: 1
enter amount : 5000
deposit succes
final bal : 15000
  

1.deposit
2.withdraw
3.see the balance
4.show transactn history
5.exit
  
Enter option: 2
enter amount : 10000
withdraw succes
final bal : 5000

1.deposit
2.withdraw
3.see the balance
4.show transactn history
5.exit
  
  
Enter option: 3
Your final bal = 5000
  
  
1.deposit
2.withdraw
3.see the balance
4.show transactn history
5.exit
  
Enter option:4
DEPOSIT 5000
WITHDRAW 10000
  
  
  
rules:
1.you cannot deposit more than 50000
2.you cannot withdraw more than 40000 ,
you cannot withdraw more than the balance.

 */
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	Scanner sc = new Scanner(System.in);
	int balance = 10000;

	public static void main(String[] args) {
		ATM m = new ATM();
		m.processOperations();
	}
	
	//int difference = balance - withdraw;
	//array has both deposit and withdrawal records 
	ArrayList<Transaction> array = new ArrayList();
	
	public void processOperations() {
		while (true) {
			menu();
			String input = sc.next();
			if (input.equalsIgnoreCase("e")) {
				break;
			} else if (input.equalsIgnoreCase("w")) {
				withdraw();
			} else if (input.equalsIgnoreCase("d")) {
				deposit();
			} else if (input.equalsIgnoreCase("h")) {
				history();
			} else if (input.equalsIgnoreCase("c")) {
				currentBalance();
			} else
				System.out.println("You have to press the right option");
		}
	}

	public void menu() {
		System.out.println("w: withdraw");
		System.out.println("d: deposit");
		System.out.println("h: show transaction history");
		System.out.println("c: current balance");
		System.out.println("e: exit");
	}

	// cannot withdraw more than 40000
	private void withdraw() {
		int withdraw = 0;
		System.out.println("How much do you wish to withdraw?");
		withdraw = sc.nextInt();
		if (withdraw > balance) {
			System.out.println("You cannot withdraw more than that " + "you have in your account");
		} else if (withdraw > 40000) {
			System.out.println("You cannot withdraw more than 40000");
		}

		else {
			balance = balance - withdraw;
			System.out.println("You have " + balance + " left in your account.");
			Transaction t = new Transaction("withdrawn value: ", withdraw);
			array.add(t);
		}
		

	}

	// cannot deposit more than 50000
	private void deposit() {
		int deposit = 0;
		System.out.println("How much do you wish to deposit?");
		deposit = sc.nextInt();

		if (deposit < 0) {
			System.out.println("You cannot deposit negative value");
			return;
		}
		if (deposit >= 50000) {
			System.out.println("You cannot deposit more than 50000");
			return;
		}else {
			balance = balance + deposit;
		System.out.println("You have " + balance + "  in your account.");
		//creating Transaction type to hold balance 
		Transaction t = new Transaction("deposit value: ", deposit);
		array.add(t);
		}
	}

	// will show the history of the all transaction
	private void history() {
		// made a Transaction class to hold the transaction values
		// made a ArrayList of Transaction type to hold the values of Transaction type
		// Transaction type has 2 values- int and string types
		
		System.out.println(array + "\n");
	}

	// will show the current balance
	private void currentBalance() {
		System.out.println("current balance is " + balance);
		// TODO Auto-generated method stub

	}

}
