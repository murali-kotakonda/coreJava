package oops.atmOperations;

	public class Transaction {
		String action ="";
		int amount = 0;

		Transaction(String a, int m){
			action = a;
			amount = m;
		}

		public String toString() {
			String res = action + " " + amount; 
			return res;
		}
		}
