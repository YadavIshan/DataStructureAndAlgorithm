import java.util.Scanner;

public class BenjaminBullb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        benjaminBullb(n);
        scn.close();
    }

    public static void benjaminBullb(int n) {
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
