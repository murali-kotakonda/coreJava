package basics.StrEx;

import java.util.Scanner;

public class Test5 {

	 public static int print(String a) {
	        int number = 0;
	        for (char ch:a.toCharArray()) {
	            if (ch == ' ') {
	                number += 1;
	            }
	        }
	        return number + 1;
	    }

	 private static int WordCount3(String sentence) {
			int count = 0;
			boolean isCharFirstEncounter=false;
			for (char r : sentence.toCharArray()) {
				if(r == ' '){
					isCharFirstEncounter = false;
				}
				else if (!isCharFirstEncounter ) {
					isCharFirstEncounter= true;
					count++;
				}  
			}
			System.out.println("word");
			return count;
		}


	    public static void main(String[] args) {
	    	 String text = "  i   b     love   tea   d   ";
	        int n = WordCount3(text);
	        System.out.println(n);
	    }
	}
