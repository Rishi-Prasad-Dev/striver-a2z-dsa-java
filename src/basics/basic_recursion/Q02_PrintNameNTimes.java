package basics.basic_recursion;

import java.util.Scanner;

public class Q02_PrintNameNTimes {

    static void printName(String name, int n) {

        if (n == 0) {
            return;
        }

        System.out.println(name);

        printName(name, n - 1);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int n = sc.nextInt();

        printName(name, n);
    }
}