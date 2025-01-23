import java.util.Scanner;
public class que11 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int n = sx.nextInt();
        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
