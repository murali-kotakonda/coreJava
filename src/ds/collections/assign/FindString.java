package ds.collections.assign;

/*
 * taking string as an input and search it in the array
	found or not found 
 */

public class FindString {
	
	public static void main(String[] args) {
		FindString n = new FindString();
		n.find("Rahul");
	}

	String[] names = { "Rahul", "Mina", "Hina", "Rina" };

	public void find(String n) {
		int l = names.length;
		boolean found = false;
		
		for (int i = 0; i < l; i++) {
			if (names[i].equals(n)) {
				System.out.println("found it " + names[i]);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("not found");
		}
	}
}
