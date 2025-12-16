package Stars;

import java.util.Scanner;

public class PatternSeventeen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternSeventeen(n);
        scn.close();
    }

    public static void patternSeventeen(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (printStar(i, j, n)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static boolean printStar(int i, int j, int n) {
        if (i == n / 2 + 1 || j == n / 2 + 1 || (i == 1 && j <= n / 2 + 1) || (i == n && j > n / 2)
                || (j == 1 && i > n / 2) || (j == n && i <= n / 2 + 1))
            return true;
        return false;
    }
}
