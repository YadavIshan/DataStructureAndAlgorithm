package Stars;

import java.util.Scanner;

public class PatternThirteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternThirteen(n);
        scn.close();
    }

    public static void patternThirteen(int n) {
        int nsp = n + (n - 1) - 2, nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print("\t");
            }
            if (i == n)
                nst -= 1;

            for (int j = nst; j >= 1; j--) {
                System.out.print("*\t");
            }
            System.out.println();
            nst += 1;
            nsp -= 2;

        }
    }
}
