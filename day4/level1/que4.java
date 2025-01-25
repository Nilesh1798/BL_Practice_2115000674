import java.util.*; 
public class que4{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
double a[]=new double[10];
double sum=0;
int c=0;
while(true){
if(c==10){
break;
}
double n=sx.nextDouble();
if(n<=0){
break;
}
a[c]=n;
c++;
}
for(int i=0;i<10;i++){
sum=(int)(a[i])+sum;
}
System.out.println("Toatl is :"+sum);
}
}
