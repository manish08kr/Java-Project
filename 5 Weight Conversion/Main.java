import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the Weight conversion Program");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. convert kgs to lbs");

        System.out.print("choose an option : ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs : ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is : %.2f ", newWeight);
        }
        else if(choice ==2){
            System.out.print("Enter the weight in kgs : ");
            weight = sc.nextDouble();
            newWeight = weight / 0.453592;
            System.out.printf("The new weight in lbs is : %.2f" , newWeight);
        }
        else{
            System.out.println("Invalid choice, please Enter valid choice");
        }

    }
    
}
