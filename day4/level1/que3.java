import java.util.*;
public class que3{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int n=sx.nextInt();
int a[]=new int[10];
for(int i=0;i<10;i++){
a[i]=n*(i+1);
}
for(int i=0;i<10;i++){
System.out.println(n+" * "+(i+1)+" = "+a[i]);
}
}
}
