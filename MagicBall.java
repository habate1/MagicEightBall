import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Enter your question: ");
        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        System.out.println();
        Random rand = new Random();
        int num = rand.nextInt(5);

        if (num == 0) System.out.println("Signs points to Yes.");
        if (num == 1) System.out.println("Maybe. ");
        if (num == 2) System.out.println("Outlook not so good. ");
        if (num == 3) System.out.println("Reply hazy, Try Again. ");
        if (num == 4) System.out.println("No. ");
        if (num == 5) System.out.println("Looks good.");
    }
}
