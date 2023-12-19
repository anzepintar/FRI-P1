
/*
 * Izpis "plusa" s krakom dolžine <n> (s pomočjo metod)
 */

import java.util.Scanner;

public class PlusNMetoda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // dolžina kraka

        // zgornji krak
        navpicniKrak(n);

        // sredina
        vodoravniKrak(n);

        // spodnji krak
        navpicniKrak(n);
    }

    public static void navpicniKrak(int visina) {
        for (int i = 1;  i <= visina;  i++) {
            zaporedje(visina, ' ', false);
            System.out.println("+");
        }
    }

    public static void vodoravniKrak(int n) {
        zaporedje(2 * n + 1, '+', true);
    }

    // Izpiše zaporedje <n> znakov <znak> in po želji (če je prelom == true)
    // doda še prelom vrstice
    public static void zaporedje(int n, char znak, boolean prelom) {
        for (int i = 1;  i <= n;  i++) {
            System.out.print(znak);
        }
        if (prelom) {
            System.out.println();
        }
    }
}
