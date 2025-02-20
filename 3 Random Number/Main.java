import java.util.Random;

public class Main{
    public static void main(String[] args) {

        Random rn = new Random();
        int num;
        
        num = rn.nextInt();
        System.out.println(num);

        num = rn.nextInt(1,70);
        System.out.println(num);
    }

}