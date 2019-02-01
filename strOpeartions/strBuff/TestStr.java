package strOpeartions.strBuff;

public class TestStr {
	public static void main(String[] args) {
		String text ="user1";
		text = text + " user2";
		text = text + " user3";
		text = text + " user4";
		text = text + " user5";
		System.out.println(text);
		
	
		
		
		StringBuffer textBuf =new StringBuffer("user1");
		textBuf.append(" user2");
		textBuf.append( " user3");
		textBuf.append(" user4");
		textBuf.append( " user5");
		
		String finalRes = textBuf.toString();
		System.out.println(finalRes);
	}
}
