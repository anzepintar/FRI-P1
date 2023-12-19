
/*
 * Ugibanje števila na intervalu [1, n]
 */

import java.util.Scanner;
import java.util.Random;

public class Ugibanje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite zgornjo mejo: ");
        int zgornjaMeja = sc.nextInt();

        // program si izbere naključno število med 1 in <zgornjaMeja>
        Random random = new Random();
        int cilj = random.nextInt(zgornjaMeja) + 1;

        System.out.print("Vaš poskus: ");
        int poskus = sc.nextInt();
        int stPoskusov = 1;

        while (poskus != cilj) {
            if (cilj > poskus) {
                System.out.println("Izbrano število je večje od vnesenega.");
            } else {
                System.out.println("Izbrano število je manjše od vnesenega.");
            }
            System.out.print("Vaš poskus: ");
            poskus = sc.nextInt();
            stPoskusov++;
        }
        System.out.println("Čestitke! Potrebovali ste " + stPoskusov + " poskusov.");
    }
}
