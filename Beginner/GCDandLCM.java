import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = scn.nextInt();
        System.out.println("Enter second number:");
        int second = scn.nextInt();
        System.out.println("GCD: " + gcd(first, second));
        System.out.println("LCM: " + lcm(first, second));
        scn.close();
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int rem = a % b;
            // Kaun divide karega and kon hoga
            a = b;
            b = rem;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}