package basics.basic_recursion;

import java.util.Scanner;

public class Q06_SumOfFirstNNumbers {

    static int sum(int x) {
        if (x == 0) {
            return 0;
        }
        return x + sum(x - 1);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
