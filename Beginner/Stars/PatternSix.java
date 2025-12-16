package Stars;

import java.util.Scanner;

public class PatternSix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternSix(n);
        scn.close();
    }

    public static void patternSix(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(count++ + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
