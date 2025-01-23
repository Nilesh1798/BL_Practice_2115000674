import java.util.*;
public class que11{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
double total=0.0;
while(true){
double x=sx.nextDouble();
if((int)x<=0){
System.out.println(total);
break;
}
total+=x;
}
}
}
