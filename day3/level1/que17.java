import java.util.*;
public class que17{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
double salary=sx.nextDouble();
double y=sx.nextDouble();
if(y>5){
salary=salary+(salary*1/20);
System.out.println("Bonus salary is:"+salary);
}
else{
System.out.println("Salary without Bonus is:"+salary);
}
}
}
