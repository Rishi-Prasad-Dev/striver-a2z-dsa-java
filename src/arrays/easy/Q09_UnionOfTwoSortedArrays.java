package arrays.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Q09_UnionOfTwoSortedArrays {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }

                i++;
            } else if (arr2[j] < arr1[i]) {

                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }

                j++;
            } else {

                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }

                i++;
                j++;
            }
        }

        while (i < n) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }

            i++;
        }

        while (j < m) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }

            j++;
        }

        for (int value : union) {
            System.out.print(value + " ");
        }
    }
}