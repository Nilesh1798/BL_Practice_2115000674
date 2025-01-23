import java.util.*;
public class que12{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int n=sx.nextInt();
int sum=0;
int ok=0;
int z=n;
while(n>=0){
sum+=n;
n--;
}
ok=z*(z+1)/2;
System.out.println("Sum of natural numbers from loop is"+sum+"and from formula is"+ok);
}
}
