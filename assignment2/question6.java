import java.util.*;


public class question1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int salary = sc.nextInt();
    int bonus = sc.nextInt();


    System.out.printf("The salary is %d and bonus is %d, hence total is %d", salary, bonus, salary + bonus);
  }
}