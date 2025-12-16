package Stars;

import java.util.Scanner;

public class PatternSixteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternSixteen(n);
        scn.close();
    }

    public static void patternSixteen(int n) {
        int nst = n, nsp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                if (i > 1 && i <= n / 2) {
                    if (1 == j || j == nst) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("*\t");
                }

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
