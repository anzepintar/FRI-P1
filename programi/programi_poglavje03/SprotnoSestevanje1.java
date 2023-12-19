
/*
 * Program sproti izpisuje vsoto doslej prebranih števil, dokler ta ne doseže
 * ali preseže 42.
 */

import java.util.Scanner;

public class SprotnoSestevanje1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vsota = 0;

        while (vsota < 42) {
            // preberemo število ...
            System.out.print("Vnesite število: ");
            int stevilo = sc.nextInt();

            // ... in ga prištejemo tekoči vsoti
            vsota = vsota + stevilo;

            // tekočo vsoto izpišemo
            System.out.println(vsota);
        }

    }
}
