package Stars;

import java.util.Scanner;

public class PatternNine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scn.nextInt();
        patternNine(n);
        scn.close();
    }

    public static void patternNine(int n) {
        int nsp = n / 2, nst = 1, val = 1;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = nsp; j >= 1; j--) {
                System.out.print("\t");
            }
            // number
            int count = val;
            for (int j = 1; j <= nst; j++) {
                System.out.print(count + "\t");
                if (j <= nst / 2) {
                    count++;
                } else {
                    count--;
                }
            }
            // space
            for (int j = nsp; j >= 1; j--) {
                System.out.print("\t");
            }
            if (i <= n / 2) {
                nst += 2;
                nsp -= 1;
                val++;
            } else {
                nst -= 2;
                nsp += 1;
                val--;
            }
            System.out.println();
        }
    }
}
