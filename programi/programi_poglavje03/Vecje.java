
/*
 * Izpiše, katero od dveh prebranih števil je večje, a ne upošteva možnosti,
 * da sta števili enaki.
 */

import java.util.Scanner;

public class Vecje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt();
        int drugo = sc.nextInt();

        if (prvo > drugo) {
            System.out.println("Prvo število je večje.");
        } else {
            System.out.println("Drugo število je večje.");
        }
    }
}
