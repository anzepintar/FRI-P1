
/*
 * Kompaktnejša različica programa Vecje2
 */

import java.util.Scanner;

public class Vecje2a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt();
        int drugo = sc.nextInt();

        if (prvo > drugo) {
            System.out.println("Prvo število je večje.");
        } else if (prvo < drugo) {
            System.out.println("Drugo število je večje.");
        } else {
            System.out.println("Števili sta enaki.");
        }
    }
}
