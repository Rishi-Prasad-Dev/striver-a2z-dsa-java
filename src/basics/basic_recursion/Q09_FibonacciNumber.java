package basics.basic_recursion;

import java.util.Scanner;

public class Q09_FibonacciNumber {

    static int fibonacci(int x) {

        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return fibonacci(x-1) +fibonacci(x-2);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println(fibonacci(n));

    }
}
