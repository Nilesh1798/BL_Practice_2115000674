import java.util.Scanner;
public class que4 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sx.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum > n) {
            System.out.println(n + " is an Abundant Number.");
        } else {
            System.out.println(n + " is Not an Abundant Number.");
        }
    }
}
