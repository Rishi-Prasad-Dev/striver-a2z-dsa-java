package binary_search.one_d;

import java.util.Scanner;

public class Q05_FloorCeil {

    static int[] floorCeil(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        int ceil = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int[] ans = floorCeil(arr, x);

        System.out.println(ans[0] + " " + ans[1]);
    }
}