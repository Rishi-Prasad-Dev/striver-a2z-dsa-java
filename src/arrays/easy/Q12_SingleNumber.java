package arrays.easy;

import java.util.Scanner;

public class Q12_SingleNumber {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int xor = arr[0];
        for (int i = 1; i < n; i++) {
            xor ^= arr[i];
        }

        System.out.println(xor);
    }
}