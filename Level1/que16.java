import java.util.Scanner;
public class que16 {
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
double total= (s * (s - 1)) / 2 ;
System.out.print("Total possible handshakes is "+total);
}
}