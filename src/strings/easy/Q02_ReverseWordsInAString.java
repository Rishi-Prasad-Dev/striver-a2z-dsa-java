package strings.easy;

import java.util.Scanner;

public class Q02_ReverseWordsInAString {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int i = str.length() - 1;

        while (i >= 0) {

            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int end = i;
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }
            int start = i + 1;

            if (result.length() > 0) {
                result.append(' ');
            }

            for (int j = start; j <= end; j++) {
                result.append(str.charAt(j));
            }
        }
        System.out.println(result.toString());
    }
}