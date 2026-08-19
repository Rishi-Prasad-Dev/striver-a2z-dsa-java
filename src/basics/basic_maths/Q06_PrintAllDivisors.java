package basics.basic_maths;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06_PrintAllDivisors {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {
                System.out.println(i);

                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        for (int i = divisors.size() - 1; i >= 0; i--) {
            System.out.println(divisors.get(i));
        }
    }
}
