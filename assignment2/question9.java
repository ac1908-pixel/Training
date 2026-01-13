import java.util.*;


public class question2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int side1 = sc.nextInt();
    int side2 = sc.nextInt();
    int side3 = sc.nextInt();


    int perimeter = side1 + side2 + side3;

    System.out.printf("The number time to run = %.2f", (float) perimeter/5);
  }
}