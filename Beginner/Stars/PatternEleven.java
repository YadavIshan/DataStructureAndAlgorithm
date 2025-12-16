package Stars;

import java.util.Scanner;

public class PatternEleven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternEleven(n);
        scn.close();
    }

    public static void patternEleven(int n) {
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "\t");
                // Calculate next value using the property: nCr+1 = nCr * (n-r) / (r+1)
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
