import java.util.Scanner;


public class question2 {
    public static void average(int math, int physics, int chemistry){
        float average = (math + physics + chemistry) / 3;

        System.out.println("Sam's average marks in PCM is "+ average);
    }
    public static void main(String[] args) {
        average(95, 96, 97);
    }
}
