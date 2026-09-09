package strings.easy;

import java.util.HashMap;
import java.util.Scanner;

public class Q05_IsomorphicStrings {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        boolean isomorphic = true;

        if (s.length() != t.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if ((smap.containsKey(sChar) && smap.get(sChar) != tChar)
                    || (tmap.containsKey(tChar) && tmap.get(tChar) != sChar)) {
                isomorphic = false;
                break;
            }
            smap.put(sChar, tChar);
            tmap.put(tChar, sChar);
        }

        if (isomorphic) {
            System.out.println("Isomorphic");
        } else {
            System.out.println("Not Isomorphic");
        }
    }
}