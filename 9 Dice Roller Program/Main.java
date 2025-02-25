import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
     * Declare variable
     * Get no of Dice from the user
     * check if no of dice > 0
     * roll all the dice
     * get the total
     * display ASCII of dice
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int noOfDice;
        int total = 0;

        System.out.print("Enter the no of dice to roll : ");
        noOfDice = sc.nextInt();

        if (noOfDice > 0) {
            for (int i = 0; i < noOfDice; i++) {
                int roll = rn.nextInt(1, 7);
                printDie(roll);
                System.out.println("you rolled : "+ roll);
                total += roll;
            }
            System.out.println("total value : " + total);
        } else {
            System.out.println("no of dice must be greater than zero");
        }
        sc.close();

    }

    static void printDie(int roll) {
        String count1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                 """;

        String count2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                 """;
        String count3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                 """;
        String count4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                 """;
        String count5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                 """;
        String count6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                 """;
        
        switch (roll) {
            case 1 -> System.out.print(count1);
            case 2 -> System.out.print(count2);
            case 3 -> System.out.print(count3);
            case 4 -> System.out.print(count4);
            case 5 -> System.out.print(count5);
            case 6 -> System.out.print(count6);
            default ->  System.out.println("Invalid roll");
            
        }         
    }
}