import java.util.*;
public class que5{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
System.out.println("Enter the number between 6-9 :");
int n=sx.nextInt();
if(n<=6 && n>=9){
System.out.println("Invalid input");
}
else{
int a[]=new int[10];
for(int i=0;i<10;i++){
a[i]=n*(i+1);
}
for(int i=0;i<10;i++){
System.out.println(n+" * "+(i+1)+" = "+a[i]);
}
}
}
}
