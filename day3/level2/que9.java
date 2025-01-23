import java.util.Scanner;
public class que9 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int n = sx.nextInt();
        int gf = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                gf = i;
                break;
            }
        }
        System.out.println("The greatest factor of " + n + " (besides itself) is: " + gf);
    }
}

