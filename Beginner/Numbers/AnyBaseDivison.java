package Numbers;

import java.util.Scanner;

public class AnyBaseDivison {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = scn.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scn.nextInt();
        System.out.print("Enter base: ");
        int base = scn.nextInt();

        int quotient = anyBaseDivision(dividend, divisor, base);
        System.out.println("Quotient: " + quotient);
        scn.close();
    }

    public static int anyBaseDivision(int dividend, int divisor, int base) {
        int quotient = 0;
        int power = 1;

        while (dividend >= divisor) {
            int count = 0;

            while (dividend >= divisor) {
                dividend = anyBaseSubtraction(dividend, divisor, base);
                count++;
            }

            quotient = anyBaseAddition(quotient, count * power, base);
            power *= 10;

            if (dividend == 0)
                break;

            dividend *= 10;
        }

        return quotient;
    }

    private static int anyBaseSubtraction(int n, int m, int b) {
        if (m > n) {
            int temp = n;
            n = m;
            m = temp;
        }

        int[] subArr = new int[n];
        int i = String.valueOf(n).length() - 1;
        int j = String.valueOf(m).length() - 1;
        int k = i;
        int borrow = 0;

        int[] arrN = toArray(n);
        int[] arrM = toArray(m);

        while (k >= 0) {
            int digit1 = (i >= 0) ? arrN[i] : 0;
            int digit2 = (j >= 0) ? arrM[j] : 0;
            int diff = digit1 - digit2 - borrow;

            if (diff < 0) {
                diff += b;
                borrow = 1;
            } else {
                borrow = 0;
            }

            subArr[k] = diff;
            i--;
            j--;
            k--;
        }

        return toNumber(subArr);
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

    private static int[] toArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }

    private static int toNumber(int[] arr) {
        int num = 0;
        for (int digit : arr) {
            num = num * 10 + digit;
        }
        return num;
    }
}
