import java.util.*;
public class que2{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
a[i]=sx.nextInt();
}
for(int i=0;i<5;i++){
if(a[i]>0){
if(a[i]%2==0){
System.out.println(a[i]+" is even number");
}
else{
System.out.println(a[i]+" is odd number");
}
}
else if(a[i]<0){
System.out.println(a[i]+" is negative");
}
else{
System.out.println(a[i]+" is zero");
}
}
}
}
