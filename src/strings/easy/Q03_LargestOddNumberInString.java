package strings.easy;

import java.util.Scanner;

public class Q03_LargestOddNumberInString {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            if ((str.charAt(i) - '0') % 2 != 0) {
                res = str.substring(0, i + 1);
                break;
            }
        }
        System.out.println(res);
    }
}