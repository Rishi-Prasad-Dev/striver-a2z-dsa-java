package arrays.easy;

import java.util.HashMap;
import java.util.Scanner;

public class Q14_LongestSubarrayWithSumZero {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }

            if (map.containsKey(sum)) {

                int length = i - map.get(sum);

                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println(maxLength);
    }
}