package Numbers;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println("Enter a base:");
        int b = scn.nextInt();
        int ans = anyBaseToDecimal(n, b);
        System.out.println(ans);
        scn.close();
    }

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int digit = n % 10;
            ans += digit * power;
            power *= b;
            n /= 10;
        }
        return ans;
    }
}
