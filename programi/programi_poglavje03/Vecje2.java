
/*
 * Izpiše, katero od dveh prebranih števil je večje, upošteva pa tudi možnost,
 * da sta števili enaki.
 */

import java.util.Scanner;

public class Vecje2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt();
        int drugo = sc.nextInt();

        if (prvo > drugo) {
            System.out.println("Prvo število je večje.");

        } else {
            // dve možnosti:
            // (1) drugo je večje
            // (2) števili sta enaki
            if (prvo < drugo) {
                System.out.println("Drugo število je večje.");
            } else {
                System.out.println("Števili sta enaki.");
            }
        }
    }
}
