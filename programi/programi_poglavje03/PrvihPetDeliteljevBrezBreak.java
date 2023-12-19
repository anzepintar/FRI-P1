
/*
 * Izpis prvih pet deliteljev prebranega števila (brez uporabe stavka break)
 */

import java.util.Scanner;

public class PrvihPetDeliteljevBrezBreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        int stDeliteljev = 0;

        boolean konec = false;
        for (int d = 1;  d <= stevilo && !konec;  d++) {
            if (stevilo % d == 0) {
                // d je delitelj števila <stevilo>
                System.out.println(d);
                stDeliteljev++;
                if (stDeliteljev == 5) {
                    konec = true;
                }
            }
        }
    }
}
