import java.util.*;
public class que15{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int n=sx.nextInt();
int fact=1;
for(int i=n;i>=1;i--){
fact*=i;

}
System.out.println("the factorial is "+fact);
}
}

