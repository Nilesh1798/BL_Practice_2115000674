import java.util.*;
public class que1{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<10;i++){
a[i]=sx.nextInt();
}
for(int i=0;i<10;i++){
if(a[i]<0){
System.out.println("Invalid age of student:"+i);
}
else if(a[i]>=18){
System.out.println("The Student with age"+a[i]+" can vote");
}
else{
System.out.println("The Student with age"+a[i]+" cannot vote");
}
}
}
}
