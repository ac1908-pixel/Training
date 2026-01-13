import java.util.Scanner;


public class question3{

    public static void kilotomiles(double kilometers){
        double miles = kilometers * 1.6;

        System.out.println("The distance in " + kilometers + " km in miles is: " + miles);
    }

    public static void main(String[] args) {
        kilotomiles(10.8);
    }
}
