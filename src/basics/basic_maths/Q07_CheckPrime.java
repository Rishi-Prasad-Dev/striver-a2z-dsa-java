package basics.basic_maths;

import java.util.Scanner;

public class Q07_CheckPrime {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);
    }
}