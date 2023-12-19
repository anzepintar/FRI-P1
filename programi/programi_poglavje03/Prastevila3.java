
/*
 * Praštevila, tretji pristop
 */

import java.util.Scanner;

public class Prastevila3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(2);  // dvojka je edino sodo praštevilo

        // nima smisla preverjati sodih števil
        for (int kandidat = 3;  kandidat <= n;  kandidat += 2) {
            boolean prastevilo = true;

            // nima smisla preverjati deljivosti s sodimi števili
            for (int d = 3;  d < kandidat;  d += 2) {
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
