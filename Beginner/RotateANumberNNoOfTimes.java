import java.util.Scanner;

public class ReverseANumberNNoOfTimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println("Enter a number of times:");
        int times = scn.nextInt();
        reverseANumberNNoOfTimes(n, times);
        scn.close();
    }

    public static void reverseANumberNNoOfTimes(int n, int times) {
        for (int i = 1; i <= times; i++) {
            n = reverseANumber(n);
        }
        System.out.println(n);
    }

    public static int reverseANumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        return reverse;
    }
}
