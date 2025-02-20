import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0;

        System.out.println("Welcome to the Calculator world!");

        while (true) {
            System.out.print("Enter the operator (+,-,*,/,^) or (press \"x\" for exit) : ");
            operator = sc.next().charAt(0);

            if (String.valueOf(operator).equalsIgnoreCase("x")) {
                System.out.println("Thank You for using this ...!");
                break; // exit the loop
            }

            // check the operator is valid before asking for numbers
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '^') {
                System.out.println("Invalid Operator. Please enter a valid one.");
                continue; // Skip asking for numbers, loop restarts
            }
            System.out.print("Enter two number : ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("cannot divide by zero");
                        continue;
                    } else {
                        result = num1 / num2;
                    }
                }
                case '^' -> result = Math.pow(num1, num2);
            }
            System.out.println("your calcuated result : " + result);
        }
    }
}