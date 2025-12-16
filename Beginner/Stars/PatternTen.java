package Stars;

import java.util.Scanner;

public class PatternTen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternTen(n);
        scn.close();
    }

    public static void patternTen(int n) {
        int nos = n / 2, nis = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nos; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= nis; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n)
                System.out.print("*\t");
            if (i <= n / 2) {
                nis += 2;
                nos--;
            } else {
                nos++;
                nis -= 2;
            }

            System.out.println();
        }
    }
}
