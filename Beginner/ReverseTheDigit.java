
import java.util.Scanner;

public class ReverseTheDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        int reverse = reverseDigit(n);
        System.out.println(reverse);
    }

    public static int reverseDigit(int n) {
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
}
