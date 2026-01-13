import java.util.*;


public class question3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    float pounds = sc.nextFloat();

    System.out.printf("The weight of the person in pound is %.2f and in kg is %.2f", pounds, pounds / 2.2);
  }
}