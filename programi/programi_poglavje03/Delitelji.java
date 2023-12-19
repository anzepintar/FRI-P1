
/*
 * Izpis in štetje deliteljev podanega števila
 */

import java.util.Scanner;

public class Delitelji {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();
        int stDeliteljev = 0;

        for (int d = 1;  d <= stevilo;  d++) {
            if (stevilo % d == 0) {
                // d je delitelj števila <stevilo>
                System.out.println(d);
                stDeliteljev++;
            }
        }
        System.out.println();
        System.out.println(stDeliteljev);
    }
}
