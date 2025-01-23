import java.util.*;
public class que3{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int a=sx.nextInt();
int b=sx.nextInt();
int c=sx.nextInt();
if(a>b && a>c){
System.out.println("first is greater among them");
}
else if(b>a && b>c){
System.out.println("second is greater among them");
}
else{
System.out.println("third is greater among them");
}
}
}
