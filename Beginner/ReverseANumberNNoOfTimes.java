import java.util.Scanner;

public class ReverseANumberNNoOfTimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println("Enter the number of times to rotate:");
        int times = scn.nextInt();
        for (int i = 1; i <= times; i++)
            rotateNumber(n, i);
        scn.close();
    }

    public static void rotateNumber(int n, int times) {
        int length = countDigits(n);
        times = times % length;
        if (times < 0) {
            times = times + length;
        }

        if (times == 0) {
            System.out.println(n);
            return;
        }

        int div = 1; // 10^times
        int mult = 1; // 10^(length - times)

        for (int i = 1; i <= length; i++) {
            if (i <= times) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        int quotient = n / div;
        int remainder = n % div;

        int rotated = remainder * mult + quotient;
        System.out.println(rotated);

    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
