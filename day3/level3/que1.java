import java.util.Scanner;
public class que1 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sx.nextInt();
        int sum = 0;
        int a = n;
        while (a != 0) {
            int remainder = a % 10; 
            sum += Math.pow(remainder, 3); 
            a /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}

