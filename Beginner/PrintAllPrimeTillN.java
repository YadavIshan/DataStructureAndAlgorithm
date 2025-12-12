import java.util.Scanner;

public class PrintAllPrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            printPrimes(n);
        } else {
            System.out.println("Please enter a valid integer.");
        }
        sc.close();
    }

    public static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}