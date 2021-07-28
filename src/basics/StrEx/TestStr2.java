package basics.StrEx;

public class TestStr2 {
	public static void main(String[] args) {
		String text1 =  "user1" ;// new memory is allocated
		String text2 =  "user1" ;// no new memory is allocated; uses existing memory

		if (text1 == text2) {
			System.out.println("text1, text2 String address are same");
		} else {
			System.out.println("text1, text2 String address are diff");
		}

	}
}
//How many memory locations are allocated
// 1
//string uses the string pooling mechanism










/*
 
		String text3 = "user2";
		String text4 = "user2";

		if (text3 == text4) {
			System.out.println("text3, text4 String address are same");
		} else {
			System.out.println("text3, text4 String address are diff");
		}
		
		
		String text5 = "user3";
		String text6= new String("user3");
		
		if (text5 .equals(text6)) {
			System.out.println("text5, text6 String content are same");
		}else {
			System.out.println("text5, text6 String content are diff");
		}
  
  
 * */
  