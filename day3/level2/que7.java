import java.util.Scanner;
public class que7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double a = h / 100;
        double bmi = w / (a * a);
        System.out.printf("BMI:", bmi);
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
