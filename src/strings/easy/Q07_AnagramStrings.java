package strings.easy;

import java.util.HashMap;
import java.util.Scanner;

public class Q07_AnagramStrings {

    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!freq.containsKey(ch)) {
                return false;
            }

            freq.put(ch, freq.get(ch) - 1);

            if (freq.get(ch) < 0) {
                return false;
            }
        }

        return true;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(isAnagram(s, t));
    }
}
