package strings.easy;

import java.util.Scanner;

public class Q04_LongestCommonPrefix {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String prefix = arr[0];

        for (int i = 1; i < n; i++) {

            int j;
            for (j = 0; j < prefix.length() && j < arr[i].length(); j++) {

                if (arr[i].charAt(j) != prefix.charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                break;
            }
        }
        System.out.println(prefix);
    }
}