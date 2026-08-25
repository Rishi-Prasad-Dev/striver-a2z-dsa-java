package arrays.easy;

import java.util.Scanner;

public class Q13_LongestSubarrayWithSumKPositives {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            while (sum > k) {

                sum -= nums[left];
                left++;
            }
            if (sum == k) {

                int length = right - left + 1;
                maxLength = Math.max(length, maxLength);
            }
        }
        System.out.println(maxLength);
    }
}
