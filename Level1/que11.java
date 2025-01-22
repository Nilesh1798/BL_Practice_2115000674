import java.util.Scanner;
public class que11 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double add=a+b;
        double sub=a-b;
        double multi=a*b;
        double div=a/b;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+add+","+sub+","+multi+" and "+div);
        }
}