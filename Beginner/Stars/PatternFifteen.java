package Stars;

import java.util.Scanner;

public class PatternFifteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternFifteen(n);
        scn.close();
    }

    public static void patternFifteen(int n) {
        int nst = n, nsp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2) {
                nst -= 2;
                nsp += 1;
            } else {
                nst += 2;
                nsp -= 1;
            }
        }
    }
}
