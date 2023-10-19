import java.util.Random;
import java.util.Scanner;

public class Ugibanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vnesite zgornjo mejo: ");
        int meja = sc.nextInt();

        Random random = new Random();
        int izbrano = random.nextInt(meja) + 1;

        System.out.println("Vaš poskus: ");
        int poskus = sc.nextInt();
        sc.close();
        while (poskus != izbrano) {
            if (izbrano > poskus) {
                System.out.println("Vneseno število je premajhno.");
            } else {
                System.out.println("Vneseno število je preveliko.");
            }
            System.out.println("Vaš poskus: ");
            poskus = sc.nextInt();
        }

    }
}
