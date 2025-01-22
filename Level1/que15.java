import java.util.Scanner;
public class que15 {
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double up=sc.nextDouble();
double qn=sc.nextDouble();
double total=up*qn;
System.out.print("The total purchase price is INR "+total+" if the quantity is "+qn+" and unit price is INR "+up);
}
}
