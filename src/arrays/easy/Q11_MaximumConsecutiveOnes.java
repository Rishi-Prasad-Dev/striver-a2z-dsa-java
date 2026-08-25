package arrays.easy;

import java.util.Scanner;

public class Q11_MaximumConsecutiveOnes {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        System.out.print(maxCount);
    }
}
