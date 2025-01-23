import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sx.nextInt();
        int sum = 0;
        int originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10; 
            sum += digit;                  
            originalNumber /= 10;
        }
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}

