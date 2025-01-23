import java.util.*;
public class que2{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int year=sx.nextInt();
if(year>=1582){
if((year%4==0 && year%100!=0)|| year%400==0){
System.out.println("Leap Year");
}
else{
System.out.println("Not a leap year");
}
}
else{
System.out.println("provide valid year");
}
}
}
