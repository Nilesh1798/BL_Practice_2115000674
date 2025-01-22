import java.util.Scanner;
public class que10 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cm=sc.nextInt();
    double inch=cm*2.14;
    int feet=(int)inch/12;
    double hx=inch%12;
    System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" andinches is "+hx);
    }  
}