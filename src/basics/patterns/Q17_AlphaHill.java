package basics.patterns;

import java.util.Scanner;

public class Q17_AlphaHill {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            ch--;

            for (int j = 1; j < i; j++) {
                ch--;
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}