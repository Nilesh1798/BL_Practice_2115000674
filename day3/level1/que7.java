import java.util.*;
public class que7{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int day=sx.nextInt();
int month=sx.nextInt();
if((month == 3 && day >= 20 && day <= 31) ||
                              (month == 4 && day >= 1 && day <= 30) ||  
                              (month == 5 && day >= 1 && day <= 31) ||
                              (month == 6 && day >= 1 && day <= 20)){
System.out.println("Spring season");

}
else{
System.out.println("Not a spring season");
}
}
}
