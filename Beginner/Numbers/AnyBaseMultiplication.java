package Numbers;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n = scn.nextInt();
        System.out.println("Enter second number:");
        int m = scn.nextInt();
        System.out.println("Enter a base:");
        int b = scn.nextInt();
        int ans = anyBaseMultiplication(n, m, b);
        System.out.println(ans);
        scn.close();
    }

    public static int anyBaseMultiplication(int n, int m, int b) {
        int ans = 0;
        int powerOfMultiplier = 1;

        while (m > 0) {
            int digit = m % 10;
            int partialProduct = multiplyByDigit(n, digit, b);
            ans = anyBaseAddition(ans, partialProduct * powerOfMultiplier, b);
            powerOfMultiplier *= 10;
            m /= 10;
        }

        return ans;
    }

    private static int multiplyByDigit(int n, int digit, int b) {
        int carry = 0;
        int result = 0;
        int power = 1;

        while (n > 0 || carry > 0) {
            int d = n % 10;
            int product = d * digit + carry;
            carry = product / b;
            int rem = product % b;
            result = result + rem * power;
            power *= 10;
            n /= 10;
        }

        return result;
    }

    private static int anyBaseAddition(int n, int m, int b) {
        int carry = 0, ans = 0, power = 1;

        while (n > 0 || carry > 0 || m > 0) {
            int digit1 = n % 10;
            int digit2 = m % 10;
            int addition = digit1 + digit2 + carry;
            carry = addition / b;
            int rem = addition % b;
            ans = ans + power * rem;
            power *= 10;
            n /= 10;
            m /= 10;
        }

        return ans;
    }
}
