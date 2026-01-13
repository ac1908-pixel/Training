import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int base = sc.nextInt();
        
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f", 0.5 * height * base, 0.5 * (height/30.48) * (base/30.48), 0.5 * (height/2.54) * (base/2.54));
    }
}
