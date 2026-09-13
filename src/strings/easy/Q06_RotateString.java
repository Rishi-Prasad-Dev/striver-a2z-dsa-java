package strings.easy;

import java.util.Scanner;

public class Q06_RotateString {

    static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String goal = sc.next();

        System.out.println(rotateString(s, goal));
    }
}