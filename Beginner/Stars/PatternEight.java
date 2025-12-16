package Stars;

import java.util.Scanner;

public class PatternEight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scn.nextInt();
        patternEight(n);
        scn.close();
    }

    public static void patternEight(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
