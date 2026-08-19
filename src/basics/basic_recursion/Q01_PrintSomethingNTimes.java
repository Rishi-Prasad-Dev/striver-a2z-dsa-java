package basics.basic_recursion;

import java.util.Scanner;

public class Q01_PrintSomethingNTimes {

    static void printSomething(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Hello");

        printSomething(n - 1);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSomething(n);

    }
}
