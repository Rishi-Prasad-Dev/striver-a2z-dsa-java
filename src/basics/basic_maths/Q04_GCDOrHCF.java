package basics.basic_maths;

import java.util.Scanner;

public class Q04_GCDOrHCF {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println(a);
    }
}
