import java.util.*;


public class question3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    double principal = sc.nextDouble();
    double rate = sc.nextDouble();
    double time = sc.nextDouble();


    double interest =  principal * rate * time / 100;

    System.out.printf("Interest: %.2f, Principal: %.2f, Rate: %.2f, Time: %.2f", interest, principal, rate, time);
  }
}