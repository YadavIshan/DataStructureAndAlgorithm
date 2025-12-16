package Stars;

import java.util.Scanner;

public class PatternTwelve {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternTwelve(n);
        scn.close();
    }

    public static void patternTwelve(int n) {
        int nsp = n + (n - 1) - 2, nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(j + "\t");
            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print("\t");
            }
            if (i == n)
                nst -= 1;
            for (int j = nst; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
            nst += 1;
            nsp -= 2;

        }
    }
}
