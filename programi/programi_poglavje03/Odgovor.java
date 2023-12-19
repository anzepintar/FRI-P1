
/*
 * Uporabnika nadlegujemo, dokler ne vnese 42
 */

import java.util.Scanner;

public class Odgovor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odgovor;
        do {
            System.out.print("Odgovor na vprašanje o vesolju, življenju in sploh vsem: ");
            odgovor = sc.nextInt();
        } while (odgovor != 42);
    }
}
