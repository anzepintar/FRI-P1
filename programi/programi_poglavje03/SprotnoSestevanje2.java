
/*
 * Program prebere pet števil.  Po vsakem branju izpiše vsoto doslej
 * prebranih števil.
 */

import java.util.Scanner;

public class SprotnoSestevanje2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vsota = 0;
        int stVnosov = 0;

        while (stVnosov < 5) {
            // preberemo število ...
            System.out.print("Vnesite število: ");
            int stevilo = sc.nextInt();

            // ... in ga prištejemo tekoči vsoti
            vsota = vsota + stevilo;

            // tekočo vsoto izpišemo
            System.out.println(vsota);

            stVnosov = stVnosov + 1;
        }

    }
}
