import java.util.*;

public class question4 {
    public static void question4(int selling_price, int cost_price){
        int profit = selling_price - cost_price;

        float profit_percentage = ((float)profit / (float)cost_price) * 100;

        System.out.println("The Cost Price is INR " + cost_price+ " and Selling Price is INR " + selling_price +  "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage);
    }

    public static void main(String args[]){
        question4(191, 129);
    }
}