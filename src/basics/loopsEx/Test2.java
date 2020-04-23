package basics.loopsEx;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the height of the square");
     int height = sc.nextInt();

     System.out.println("Enter the wight of the square");
     int wight = sc.nextInt();

     for (int i = 1; i <= height; i++) {
         for (int j = 1; j <= wight; j++) {
             if (height == i || wight == j || i == 1 || j == 1) {
                 System.out.print("*");
             } else System.out.print(" ");
         }
         System.out.println();
     }
}
}
