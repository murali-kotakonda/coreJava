package similar;

/**
 12
# 8 2 4 4 3
. 1 2 4 2 2 2 6 1 1
. 1 2 5 2 1 2 6 1 1
. 1 2 5 1 2 2 6 1 1
. 1 2 4 2 2 2 6 1 1
. 1 7 3 2 6 1 1
. 1 2 4 2 2 2 6 1 1
. 1 2 5 2 1 2 6 1 1
. 1 2 5 2 2 2 5 1 1
. 1 2 5 2 2 2 4 2 1
. 1 2 4 2 4 2 3 1 2
# 7 8 2 4

35
. 11 7 12
. 10 10 10
. 10 10 10
. 9 12 9
. 9 12 9
. 9 12 9
. 9 12 9
. 9 12 9
. 9 4 1 7 9
. 9 2 5 5 9
. 10 12 8
. 10 12 8
. 9 7 2 5 7
. 8 3 1 3 3 6 6
. 7 3 9 5 7
. 7 3 9 6 5
. 6 4 9 7 4
. 6 4 10 6 4
. 5 4 11 7 3
. 5 4 12 6 3
. 4 4 13 6 3
. 4 4 13 6 3
. 4 4 13 6 3
. 4 4 13 6 3
. 4 4 12 7 3
. 3 1 2 3 11 8 2
# 4 3 4 9 8 2
# 4 4 4 8 1 5 2 2
# 2 6 4 7 2 6 3
# 2 7 3 6 3 7 2
# 2 8 3 3 5 7 2
# 1 9 11 5 4
# 4 6 11 3 4 2
. 1 25 4
. 5 6 8 6 5
0
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		for (int count = 1; count <= 10; count++) {
			int cases = sc.nextInt();
			if (cases == 0) {
				if(list.size()>0) {
					list.remove(list.size()-1);
				}
				list.add("Error decoding image");
				break;
			}
			sc.nextLine();
			String t1 = "";
			for (int i = 1; i <= cases; i++) {
				t1 = sc.nextLine();
				char first = t1.charAt(0);
				String show[] = { ".", "#" };
				int curr = 1;
				if (Character.compare(first, '.') == 0) {
					curr = 0;
				} else {
					curr = 1;
				}
				StringBuffer b = new StringBuffer();
				//for (int j = 2; j < t1.length(); j = j + 2) {
					//char ch = t1.charAt(j);
				for(String ch : t1.split("\\s+")) {
					if(ch.equals("."))
						continue;
					int num = Integer.parseInt(ch);
					for (int m = 0; m < num; m++) {
						b.append(show[curr]);
					}
					curr = ((curr + 1) % 2);
				}
				list.add(b.toString());
			}
			list.add("");
		}

		for (String s : list) {
			System.out.println(s);
		}

	}
}
