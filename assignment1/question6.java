public class question6{
    public static void main(String args[]){
        int fee = 125000;
        int discountPercent = 10;
        float discount = (float)(discountPercent/100.0f) * fee;
        float payment = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + payment);
    }
}