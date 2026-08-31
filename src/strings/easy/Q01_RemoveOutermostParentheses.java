package strings.easy;

import java.util.Scanner;

public class Q01_RemoveOutermostParentheses {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {

                if (count > 0) {
                    result.append('(');
                }

                count++;

            } else {

                count--;

                if (count > 0) {
                    result.append(')');
                }
            }
        }
        System.out.println(result.toString());
    }
}