import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective1 : ");
        adj1 = sc.nextLine();

        System.out.print("Enter a noun (animal or person name) : ");
        noun1 = sc.nextLine();

        System.out.print("Enter an adjective2 : ");
        adj2 = sc.nextLine();

        System.out.print("Enter a verb ending eith -ing (action) : ");
        verb1 = sc.nextLine();

        System.out.print("Enter an adjective3 : ");
        adj3 = sc.nextLine();

        System.out.println("Today I went to a "+adj1+" zoo.");
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adj2+" and "+ verb1 +"!" );
        System.out.println("I was "+adj3+"!");

    }
} 