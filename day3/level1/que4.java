import java.util.*;
public class que4{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int n=sx.nextInt();
if(n<=0){
System.out.println("not a natural number");

}
else{
int sum=n*(n+1)/2;
System.out.println(sum);
}
}
}
