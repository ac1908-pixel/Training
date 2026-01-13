import java.util.*;

public class question6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int fee = sc.nextInt();
        int discountPercent = sc.nextInt();
        float discount = (float)(discountPercent/100.0f) * fee;
        float payment = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + payment);
    }
}