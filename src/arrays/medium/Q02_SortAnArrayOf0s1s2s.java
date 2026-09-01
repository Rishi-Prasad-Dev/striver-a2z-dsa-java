package arrays.medium;

import java.util.Scanner;

public class Q02_SortAnArrayOf0s1s2s {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        // Dutch National Flag Algorithm (Three pointers)
        while (mid <= high) {

            // Move 0 to the left region
            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            }
            // 1 is already in the middle region
            else if (nums[mid] == 1) {

                mid++;

            }
            // Move 2 to the right region
            else {

                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}