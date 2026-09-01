package arrays.medium;

import java.util.HashMap;
import java.util.Scanner;

public class Q01_TwoSum {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        boolean found = false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int required = k - nums[i];

            if (map.containsKey(required)) {

                System.out.println("[" + map.get(required) + "," + i + "]");
                found = true;
                break;
            }
            map.put(nums[i], i);
        }
        if (!found) {
            System.out.println("[-1,-1]");
        }
    }
}
