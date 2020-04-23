package basics.stringcompare;


public class TestStringCompare {
	public static void main(String[] args) {
		String text1 = "Hi How are you!!";
		String text2 = "Hi How are you!!";

		String text3 = new String("Hi How are you!!");

		System.out.println();

		if (text1 == text2) {
				System.out.println("text1 and text2 are equal");
		}else{
			System.out.println("text1 and text2 are not equal");
		}

		if (text1 == text3) {
			System.out.println("text1 and text3 are equal");
		}else{
			System.out.println("text1 and text3 are not equal");
		}

		if (text1.equals(text3)) {
			System.out.println("text1 and text3 are equal");
		}else{
			System.out.println("text1 and text3 are not equal");
		}
	}
}
