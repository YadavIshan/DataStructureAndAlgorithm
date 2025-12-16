import java.util.Scanner;

public class CountDigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println("Enter a digit:");
        int d = scn.nextInt();
        int count = countDigitFrequency(n, d);
        System.out.println(d + " occurred " + count + " times");
        scn.close();
    }

    public static int countDigitFrequency(int n, int d) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
