import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        int min = 1, max = 100;
        int guess;
        int attempts = 0;

        int randomNumber = rn.nextInt(min,max+1);

        System.out.println("Welcome to the number guessing game...!");
        System.out.printf("Guess a number between %d to %d\n", min, max);

        do{
            System.out.print("Enter your number : ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("It's too low, try again");
            }
            else{
                System.out.println("It's too high, try again");
            }

        }while(guess != randomNumber);

        System.out.println("Wow! you guessed it Right in "+attempts+" no of attempts");

    }
}