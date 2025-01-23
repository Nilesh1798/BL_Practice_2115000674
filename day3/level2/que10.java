import java.util.Scanner;
public class que10 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int n = sx.nextInt();
        int p = sx.nextInt();
        int r = 1;
        for (int i = 1; i <= p; i++) {
            r *= n;
        }
        System.out.println(n + " raised to the power of " + p + " is " + r);
    }
}

