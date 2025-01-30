import java.util.*;
public class number{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
System.out.println("Enter the number between 1-100 :");
int n=sx.nextInt();
int a=1;
int b=99;
if(n>100){
System.out.println("Invalid number");
}
else{

for(;;){
    int c=(int)(Math.random()*(b-a)+1)+a;
    System.out.println("Random number is"+c);
if(n>c){
System.out.println("High");
a=c;

}
else if(n<c){
System.out.println("Low");
b=c;
}
else{
System.out.println("We found Equal match");
break;
}
}
}
}
}

