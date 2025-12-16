package Numbers;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n = scn.nextInt();
        System.out.println("Enter second number:");
        int m = scn.nextInt();
        System.out.println("Enter a base:");
        int b = scn.nextInt();
        int ans = n > m ? anyBaseSubtraction(n, m, b) : anyBaseSubtraction(m, n, b);
        System.out.println(ans);
        scn.close();
    }

    public static int anyBaseSubtraction(int n, int m, int b) {
        int borrow = 0, ans = 0, power = 1;

        while (n > 0 || borrow > 0 || m > 0) {
            int digit1 = n % 10;
            int digit2 = m % 10;
            int subtraction = digit1 - digit2 - borrow;
            if (subtraction < 0) {
                subtraction += b;
                borrow = 1;
            } else {
                borrow = 0;
            }
            ans = ans + power * subtraction;
            power *= 10;
            n /= 10;
            m /= 10;
        }

        return ans;
    }
}
