package arrays.easy;

import java.util.Scanner;

public class Q06_LeftRotateArrayByD {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        d=d%n;
        int temp[] = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - d];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}