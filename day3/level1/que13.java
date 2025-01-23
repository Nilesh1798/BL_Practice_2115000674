import java.util.*;
public class que13{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int n=sx.nextInt();
int sum=0;
int ok=0;
int z=n;
for(int i=n;i>=1;i--){
sum+=i;

}
ok=z*(z+1)/2;
System.out.println("Sum of natural numbers from loop is"+sum+"and from formula is"+ok);
}
}
