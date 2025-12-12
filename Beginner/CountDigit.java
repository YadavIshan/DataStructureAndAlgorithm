import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = countDigits(n);
            System.out.println("Number of digits: " + count);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        sc.close();
    }

    public static int countDigits(int n) {
        if (n == 0)
            return 1;
        n = Math.abs(n); // Handle negative numbers
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
