import java.util.Scanner;
public class que9 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountPercent=sc.nextInt();
        int discount=(fee*discountPercent)/100;
        int feePaid=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feePaid);
        }   
}