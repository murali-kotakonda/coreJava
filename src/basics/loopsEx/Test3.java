package basics.loopsEx;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
        /*
         * *
         * **
         * ***
         * ****
         * ***
         * **
         * *
         */
        System.out.println("If you want to draw a vertical mountain, enter his height: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int countOne = 0;
        int countTwo = -1;

        for (int i = 0; i < height * height; i++) {
            System.out.print("*");
            countTwo++;
            if (countOne == countTwo) {
                System.out.println();
                countTwo = -1;
                if (i < (height * height + height) / 2 - 1) {
                    countOne++;
                } else countOne--;
            }
        }
}
}