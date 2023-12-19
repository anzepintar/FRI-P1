
/*
 * Praštevila, četrti pristop
 */

import java.util.Scanner;

public class Prastevila4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(2);

        for (int kandidat = 3;  kandidat <= n;  kandidat += 2) {
            boolean prastevilo = true;

            // če število <kandidat> nima nobenega delitelja med
            // 2 in svojim korenom, ga tudi v nadaljevanju ne bo imelo
            int zgornjaMeja = (int) Math.round(Math.sqrt(kandidat));
            for (int d = 3;  d <= zgornjaMeja;  d += 2) {
                if (kandidat % d == 0) {
                    prastevilo = false;
                    break;
                }
            }
            if (prastevilo) {
                System.out.println(kandidat);
            }
        }
    }
}
