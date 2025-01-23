import java.util.Scanner;
public class que12 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int n = sx.nextInt();
        System.out.println("Multiples of " + n + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }
}

