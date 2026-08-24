package arrays.easy;

import java.util.Scanner;

public class Q10_FindMissingNumber {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int xor=n;
        for (int i = 0; i < n; i++) {
            xor ^= arr[i]^i;
        }

        System.out.println(xor);
    }
}
