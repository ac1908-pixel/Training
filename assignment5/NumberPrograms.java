import java.util.Scanner;

public class NumberPrograms {

    // Armstrong Number
    static void isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

    // Count number of digits
    static void countDigits(int number) {
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }

    // Harshad Number
    static void isHarshad(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }

    // Abundant Number
    static void isAbundant(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
    }

    // Day of Week
    static void dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println(d0);
    }

    // Calculator using switch case
    static void calculator(double first, double second, String op) {
        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second != 0) {
                    System.out.println(first / second);
                } else {
                    System.out.println("Division by zero not allowed");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int armstrongNum = sc.nextInt();
        isArmstrong(armstrongNum);

        int digitNum = sc.nextInt();
        countDigits(digitNum);

        int harshadNum = sc.nextInt();
        isHarshad(harshadNum);

        int abundantNum = sc.nextInt();
        isAbundant(abundantNum);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        dayOfWeek(month, day, year);

        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();
        calculator(first, second, op);
    }
}
