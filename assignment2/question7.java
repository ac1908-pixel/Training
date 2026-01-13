import java.util.*;


public class question1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int temp = num2;
    num2 = num1;
    num1 = temp;


    System.out.printf("The swapped numbers are: %d, %d", num1, num2);
  }
}