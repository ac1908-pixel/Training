import java.util.*;


public class question4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int farenheit = sc.nextInt();
    int celcius = (farenheit - 32) * 5/9;

    System.out.printf("The farenheit is %d, celcius is %d", farenheit, celcius);
  }
}