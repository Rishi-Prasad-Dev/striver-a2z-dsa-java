package basics.basic_recursion;

import java.util.Scanner;

public class Q04_PrintNTo1 {

    static void recursiveNTo1(int x) {

        if (x == 0) {
            return;
        }

        System.out.println(x);
        recursiveNTo1(x - 1);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiveNTo1(n);
    }
}
