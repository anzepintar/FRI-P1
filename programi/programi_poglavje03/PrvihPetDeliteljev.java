
/*
 * Izpis prvih pet deliteljev prebranega števila (s pomočjo stavka break)
 */

import java.util.Scanner;

public class PrvihPetDeliteljev {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        int stDeliteljev = 0;

        for (int d = 1;  d <= stevilo;  d++) {
            if (stevilo % d == 0) {
                // d je delitelj števila <stevilo>
                System.out.println(d);
                stDeliteljev++;
                if (stDeliteljev == 5) {
                    break;
                }
            }
        }
        // break nas vrže na to točko
    }
}
