import java.util.Scanner;

public class temperature {


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void displayResult(double result, String unit) {
        System.out.println("Converted temperature: " + result + " " + unit);
    }

    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int choice = getInput("Enter 1 to convert Fahrenheit to Celsius or 2 to convert Celsius to Fahrenheit: ");
        
        if (choice == 1) {
            double fahrenheit = sx.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(celsius, "Celsius");
        } else if (choice == 2) {
            double celsius = sx.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult(fahrenheit, "Fahrenheit");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

