import java.util.Scanner;
public class que14 {public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double fd=sc.nextDouble();
double yd=fd/3;
double md=yd/1760;
System.out.print("Distance in feet is "+fd);
System.out.print(" Distance in yards is "+yd+
" and in miles is "+md);
}
}