import java.util.Scanner;

public class PrintFibonnaciNumbersTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        printFibonacci(n);
        scn.close();
    }

    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
