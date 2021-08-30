package basics.StrEx;

public class TestStr3 {
	public static void main(String[] args) {
		String text5 = "user3"; // new memory allocated
		String text6= new String("user3"); // new memory allocated
		
		if (text5 == text6) {
			System.out.println("text5, text6 String address are same");
		}else {
			System.out.println("text5, text6 String address are diff");
		}
		
		
		if (text5 .equals(text6)) {
			System.out.println("text5, text6 String content are same");
		}else {
			System.out.println("text5, text6 String content are diff");
		}

	}
}
//How many memory locations are allocated
// 2


