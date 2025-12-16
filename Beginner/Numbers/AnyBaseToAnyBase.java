package Numbers;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        System.out.println("Enter a  from base:");
        int fb = scn.nextInt();
        System.out.println("Enter a to base:");
        int tb = scn.nextInt();
        int ans = anyBaseToAnyBase(n, fb, tb);
        System.out.println(ans);
        scn.close();
    }

    public static int anyBaseToAnyBase(int n, int fb, int tb) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int digit = n % fb;
            ans += digit * power;
            power *= tb;
            n /= fb;
        }
        return ans;
    }
}
