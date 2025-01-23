import java.util.*;
public class que18{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
System.out.println("Enter a number between 6-9");
int n=sx.nextInt();
for(int i=1;i<=10;i++){
int sum=n*i;
System.out.println(n+" * "+i+" ="+sum);
}
}
}
