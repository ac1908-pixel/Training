import java.util.*;


public class question4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int celcius = sc.nextInt();
    int farenheit = (celcius * 9/5) + 32;

    System.out.printf("The celcius is %d, farenheit is %d", celcius, farenheit);
  }
}