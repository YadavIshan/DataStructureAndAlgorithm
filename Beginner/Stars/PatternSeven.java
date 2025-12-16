package Stars;

import java.util.Scanner;

public class PatternSeven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        patternSeven(n);
        scn.close();
    }

    public static void patternSeven(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(a + " ");
                    int c = a + b;
                    a = b;
                    b = c;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
