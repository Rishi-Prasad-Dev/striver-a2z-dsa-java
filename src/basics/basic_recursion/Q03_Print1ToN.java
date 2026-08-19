package basics.basic_recursion;

import java.util.Scanner;

public class Q03_Print1ToN {

    static void recursive1ToN(int x) {

        if (x == 0) {
            return;
        }

        recursive1ToN(x-1);
        System.out.println(x);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive1ToN(n);
    }
}
