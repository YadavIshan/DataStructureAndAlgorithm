package Numbers;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println("Enter a base:");
        int b = scn.nextInt();
        int ans = decimalToAnyBase(n, b);
        System.out.println(ans);
        scn.close();
    }

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % b;
            ans = ans + digit * power;
            power *= 10;
            n /= b;
        }
        return ans;
    }
}
