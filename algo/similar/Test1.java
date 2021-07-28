package similar;
/**
 3
ATCCGCTTAGAGGGATT
GTCCGTTTAGAAGGTTT
abcdefghijklmnopqrstuvwxyz
bcdefghijklmnopqrstuvwxyza
abcdefghijklmnopqrstuvwxyz0123456789
abcdefghijklmnopqrstuvwxyz0123456789



ATCCGCTTAGAGGGATT
GTCCGTTTAGAAGGTTT
*....*.....*..*..

abcdefghijklmnopqrstuvwxyz
bcdefghijklmnopqrstuvwxyza
**************************

abcdefghijklmnopqrstuvwxyz0123456789
abcdefghijklmnopqrstuvwxyz0123456789
....................................



 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int cases = sc.nextInt();
	List<String> list= new ArrayList<>();
	for(int i=1;i<=cases;  i++) {
		String t1= sc.next();
		String t2= sc.next();
		
		list.add(t1);
		list.add(t2);
	}
	
	for(int i=0;i<list.size();i =i+2) {
		String t1 = list.get(i);
		String t2 = list.get(i+1);
		StringBuffer diff =new StringBuffer();
		
		for(int j=0;j<t1.length() ; j++) {
			
			if(t1.charAt(j) == t2.charAt(j)) {
				diff.append(".");
			}else {
				diff.append("*");
			}
			
		}
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(diff.toString());
	}
	System.out.println(6%5);
	
	
}
}
