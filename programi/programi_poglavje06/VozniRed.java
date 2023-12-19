
/*
 * Izpis voznega reda avtobusa s pomočjo objektov razreda Cas
 */

import java.util.Scanner;

public class VozniRed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uraZac = sc.nextInt();
        int minutaZac = sc.nextInt();
        int uraKon = sc.nextInt();
        int minutaKon = sc.nextInt();
        int interval = sc.nextInt();   // interval v minutah

        Cas cas = new Cas(uraZac, minutaZac);
        Cas casKon = new Cas(uraKon, minutaKon);

        while (cas.jeManjsiAliEnakOd(casKon)) {
            System.out.println(cas.toString());
            cas = cas.plus(0, interval);
        }
    }
}
