import java.util.Scanner;

public class Level2Programs {

    static void leapYearMultiIf(int year) {
        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    static void leapYearSingleIf(int year) {
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    static void gradeCalculator(double physics, double chemistry, double maths) {
        double avg = (physics + chemistry + maths) / 3;
        System.out.println("Average: " + avg);

        if (avg >= 80) {
            System.out.println("Grade A");
        } else if (avg >= 70) {
            System.out.println("Grade B");
        } else if (avg >= 60) {
            System.out.println("Grade C");
        } else if (avg >= 50) {
            System.out.println("Grade D");
        } else if (avg >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade R");
        }
    }

    static void isPrime(int number) {
        if (number <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }

    static void fizzBuzzFor(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    static void fizzBuzzWhile(int number) {
        int i = 0;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }

    static void bmiCalculator(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI: " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    static void youngestAndTallest(int aAge, int aHeight, int bAge, int bHeight, int cAge, int cHeight) {
        int youngestAge = Math.min(aAge, Math.min(bAge, cAge));
        int tallestHeight = Math.max(aHeight, Math.max(bHeight, cHeight));

        System.out.println("Youngest Age: " + youngestAge);
        System.out.println("Tallest Height: " + tallestHeight);
    }

    static void greatestFactor(int number) {
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println(greatestFactor);
    }

    static void powerOfNumber(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(result);
    }

    static void factorsOfNumber(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void multiplesBelow100(int number) {
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        leapYearMultiIf(year);
        leapYearSingleIf(year);

        double p = sc.nextDouble();
        double c = sc.nextDouble();
        double m = sc.nextDouble();
        gradeCalculator(p, c, m);

        int primeCheck = sc.nextInt();
        isPrime(primeCheck);

        int fb = sc.nextInt();
        fizzBuzzFor(fb);
        fizzBuzzWhile(fb);

        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        bmiCalculator(weight, height);

        int aAge = sc.nextInt();
        int aHeight = sc.nextInt();
        int bAge = sc.nextInt();
        int bHeight = sc.nextInt();
        int cAge = sc.nextInt();
        int cHeight = sc.nextInt();
        youngestAndTallest(aAge, aHeight, bAge, bHeight, cAge, cHeight);

        int num = sc.nextInt();
        greatestFactor(num);

        int base = sc.nextInt();
        int pow = sc.nextInt();
        powerOfNumber(base, pow);

        int factNum = sc.nextInt();
        factorsOfNumber(factNum);

        int mult = sc.nextInt();
        multiplesBelow100(mult);
    }
}
