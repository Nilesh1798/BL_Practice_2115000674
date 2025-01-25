import java.util.*;
public class que6{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
double a[]=new double[11];
double sum=0.0;
for(int i=0;i<11;i++){
a[i]=sx.nextDouble();
sum+=a[i];
}
System.out.println("Mean of 11 players is :"+sum/11);

}
}

