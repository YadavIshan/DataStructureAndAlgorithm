import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        int inverse = inverseOfNumber(n);
        System.out.println(inverse);
        scn.close();
    }

    public static int inverseOfNumber(int n) {
        int value = 1;
        int inverse = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            inverse = inverse + value * (int) Math.pow(10, digit - 1);
            value += 1;
        }

        return inverse;
    }
}