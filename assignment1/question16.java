import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();

        System.out.println((numberOfStudents * (numberOfStudents - 1)) / 2);
    }
}