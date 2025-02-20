import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String items;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.print("What items would you like to buy? : ");
        items = sc.nextLine();

        System.out.print("What is the price for each? : ");
        price = sc.nextDouble();

        System.out.print("How would you like? : ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought "+quantity+" "+items+"/s");
        System.out.println("Your total is "+currency + total);


    }
}
