package basics.basic_maths;

import java.util.Scanner;

public class Q05_ArmstrongNumber {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp=n;

        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int)Math.pow(digit, digits);
            temp /= 10;
        }

        System.out.println(sum == n);
    }
}