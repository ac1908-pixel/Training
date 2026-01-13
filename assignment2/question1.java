import java.util.*;


public class question1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int number1 = sc.nextInt();
    int number2 = sc.nextInt();


    System.out.printf("The Quotient is %.2f and Reminder is %d of two number %d and %d", (float)number1 / (float)number2, number1 % number2, number1, number2);
  }
}