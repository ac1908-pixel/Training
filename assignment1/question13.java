import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int perimeter = sc.nextInt();
        float side = (float)perimeter / 4;
        
        System.out.printf("The length of the side is " + side +  " whose perimeter is " + perimeter);
    }
}