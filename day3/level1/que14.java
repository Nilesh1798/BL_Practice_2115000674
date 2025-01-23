import java.util.*;
public class que14{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int n=sx.nextInt();
int fact=1;
while(n>=1){
fact*=n;
n--;
}
System.out.println("the factorial is "+fact);
}
}
