
/*
 * Praštevila, drugi pristop
 */

import java.util.Scanner;

public class Prastevila2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int kandidat = 2;  kandidat <= n;  kandidat++) {
            // če je <kandidat> deljiv s katerimkoli številom med 2 in
            // <kandidat> - 1, lahko takoj zaključimo, da <kandidat> NI
            // praštevilo
            boolean prastevilo = true;
            for (int d = 2;  d < kandidat;  d++) {
                if (kandidat % d == 0) {
                    prastevilo = false;
                    break;
                    // <kandidat> ni praštevilo, zato nima smisla,
                    // da še naprej preverjamo njegovo deljivost
                }
            }
            // na tej točki je <prastevilo> enako true natanko v primeru,
            // če se nobeno deljenje ni izšlo (potem vem, da je <kandidat>
            // praštevilo)
            if (prastevilo) {
                System.out.println(kandidat);
            }
        }
    }
}
