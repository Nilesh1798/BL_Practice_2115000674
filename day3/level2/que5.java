import java.util.Scanner;
public class que5 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sx.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            for (int i = 0; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
