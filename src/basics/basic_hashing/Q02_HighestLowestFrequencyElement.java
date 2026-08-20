package basics.basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q02_HighestLowestFrequencyElement {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int minFreq = n;
        int maxFreq = 0;

        int minElement = 0;
        int maxElement = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            if (entry.getValue() < minFreq) {

                minFreq = entry.getValue();
                minElement = entry.getKey();
            }

            if (entry.getValue() > maxFreq) {

                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println(minElement);
        System.out.println(maxElement);
    }
}
