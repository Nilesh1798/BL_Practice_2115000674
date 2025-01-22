import java.util.Scanner;
public class que12 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double area_in_cm=0.5*height*base;
        double area_in_inches=area_in_cm/2.14;
        System.out.println("Area in square cm is "+area_in_cm+" and in square inches is "
        +area_in_inches);
        }
}
