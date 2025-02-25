import java.util.Scanner;

public class Main {
    /*
     * Declare variable
     * Display Menu
     * Get and process users choice
     * showBalance()
     * deposite()
     * withdraw()
     * Exit message
     */

    static Scanner sc = new Scanner(System.in); // accessible in all method

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("\n************* Welcome to the Banking Programming *************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice from above (1-4) : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += Deposit();
                case 3 -> balance -= Withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Input! , Please enter a valid one");
            }
        }
        System.out.println("Thank for the use ");
        sc.close();
    }

    static void showBalance(double balance) {
        System.out.printf("your net balance is $ %.2f", balance);
    }

    static double Deposit() {
        double amount;
        System.out.print("Enter your amount to be deposited : ");
        amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("amount can't be Zero or negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double Withdraw(double balance){
        double amount;
        System.out.print("Enter your withdrawal amount : ");
        amount = sc.nextDouble();
        if(amount>balance){
            System.out.print("amount can't be greater than your balance : ");
            return 0;
        }
        else if(amount<0){
           System.out.println("Amount can't be negative");
        }
        else{
            return amount;
        }
    }
}
