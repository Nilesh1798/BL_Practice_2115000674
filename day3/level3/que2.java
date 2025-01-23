import java.util.Scanner;
public class que2 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sx.nextInt();
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n /= 10; 
                count++;
            }
        }
        System.out.println("The number of digits is: " + count);
    }
}
