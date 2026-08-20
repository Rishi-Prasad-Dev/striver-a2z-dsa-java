package basics.basic_recursion;

import java.util.Scanner;

public class Q08_CheckStringPalindrome {

    static boolean isPalindrome(String str, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindrome(str, left + 1, right - 1);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        System.out.println(isPalindrome(st, 0, st.length() - 1));
    }
}
