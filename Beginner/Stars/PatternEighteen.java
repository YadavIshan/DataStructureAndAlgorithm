package Stars;

import java.util.Scanner;

public class PatternEighteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternEighteen(n);
        scn.close();
    }

    public static void patternEighteen(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n
                        || ((i > n / 2) && (i == j || i + j == n + 1))) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
