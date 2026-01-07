package Numbers;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println("Enter a  from base:");
        int fb = scn.nextInt();
        System.out.println("Enter a to base:");
        int tb = scn.nextInt();
        int ans = anyBaseToAnyBase(n, fb, tb);
        System.out.println(ans);
        scn.close();
    }

    public static int anyBaseToAnyBase(int n, int fb, int tb) {
        int decimal = anyBaseToDecimal(n, fb);
        int result = decimalToAnyBase(decimal, tb);
        return result;
    }

    public static int anyBaseToDecimal(int n, int base) {
        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % 10;
            decimal += digit * power;
            power *= base;
            n /= 10;
        }

        return decimal;
    }

    public static int decimalToAnyBase(int decimal, int base) {
        int result = 0;
        int power = 1;

        while (decimal > 0) {
            int remainder = decimal % base;
            result += remainder * power;
            power *= 10;
            decimal /= base;
        }

        return result;
    }
}
