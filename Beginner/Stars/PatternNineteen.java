package Stars;

import java.util.Scanner;

public class PatternNineteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternNineteen(n);
        scn.close();
    }

    public static void patternNineteen(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int distFromTop = i;
                int distFromBottom = 2 * n - i;
                int distFromLeft = j;
                int distFromRight = 2 * n - j;
                int minDist = Math.min(Math.min(distFromTop, distFromBottom),
                        Math.min(distFromLeft, distFromRight));

                int value = n - minDist + 1;
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }
    }
}
