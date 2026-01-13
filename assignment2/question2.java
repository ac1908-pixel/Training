import java.util.*;


public class question2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();


    int eq1 = a + b *c;
    int eq2 = a * b + c;
    int eq3 = c + a / b;
    int eq4 = a % b + c;

    System.out.printf("Outputs: %d, %d, %d, %d", eq1, eq2, eq3, eq4);
  }
}