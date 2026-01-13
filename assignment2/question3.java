import java.util.*;


public class question3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();


    double eq1 = a + b *c;
    double eq2 = a * b + c;
    double eq3 = c + a / b;
    double eq4 = a % b + c;

    System.out.printf("Outputs: %.2f, %.2f, %.2f, %.2f", eq1, eq2, eq3, eq4);
  }
}