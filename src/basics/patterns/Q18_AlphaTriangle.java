package basics.patterns;

import java.util.Scanner;

public class Q18_AlphaTriangle {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (char ch = (char) ('A' + n - 1 - i);
                 ch <= (char) ('A' + n - 1);
                 ch++) {

                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}