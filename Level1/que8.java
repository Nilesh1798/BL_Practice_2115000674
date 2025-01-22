import java.util.Scanner;
public class que8 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    double feetDistance=sc.nextDouble();
    double yardsDistance=feetDistance/3;
    double milesDistance=yardsDistance/1760;
    System.out.print("Distance in feet is "+feetDistance);
    System.out.print(" Distance in yards is "+yardsDistance+
    " and in miles is "+milesDistance);
    }    
}
