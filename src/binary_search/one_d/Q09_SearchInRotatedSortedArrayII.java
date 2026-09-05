package binary_search.one_d;

import java.util.Scanner;

public class Q09_SearchInRotatedSortedArrayII {

    static boolean search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return false;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(search(arr, x));
    }
}
