
/*
 * Naloga Izštevanka, rešena brez uporabe vektorja
 */

import java.util.Scanner;

public class Izstevanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        // preberi imena otrok
        String[] otroci = new String[stOtrok];
        for (int i = 0;  i < stOtrok;  i++) {
            otroci[i] = sc.next();
        }

        // število krogov izštevanke
        int stKrogov = stOtrok - 1;

        // število otrok, ki so še v igri
        int stOtrokVIgri = stOtrok;

        // simuliraj izštevanko
        for (int krog = 1;  krog <= stKrogov;  krog++) {
            // ugotovi, kdo izpade
            int ixIzpadlega = (stBesed - 1) % stOtrokVIgri;
            System.out.println(otroci[ixIzpadlega]);

            // izloči izpadlega
            for (int i = ixIzpadlega;  i < stOtrokVIgri - 1;  i++) {
                otroci[i] = otroci[i + 1];
            }
            stOtrokVIgri--;
        }
    }
}
