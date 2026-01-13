import java.util.Scanner;


public class question1 {
    public static void question1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the year of birth");

        int year = sc.nextInt();

        int age = 2024 - year;

        System.out.println("Harry's age in 2024 is "+ age);
    }

    public static void main(String[] args) {
        question1();
    }
}
