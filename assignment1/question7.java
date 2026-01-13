import java.util.*;

public class question7 {
    public static void main(String args[]){

        double radius = 6378;
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double volume_in_miles = (4.0/3.0) * Math.PI * Math.pow((radius / 1.6), 3);

        System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", volume) + " and cubic miles is " + String.format("%.2f", volume_in_miles));


    }
}