import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;


        System.out.printf("Your distance in feet is %.2f while in yards is %.2f and miles is %.6f%n", distanceInFeet, distanceInYards, distanceInMiles);

        sc.close();
    }
}
