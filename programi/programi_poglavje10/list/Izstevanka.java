
//
// Program za simulacijo izštevanke. Imena otrok hranimo v seznamu (objektu
// tipa List).
//

import java.util.*;

public class Izstevanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        // preberi imena otrok v seznam
        List<String> otroci = new ArrayList<>();
        for (int i = 0; i < stOtrok; i++) {
            otroci.add(sc.next());
        }

        // število krogov izštevanke
        int stKrogov = stOtrok - 1;

        // simuliraj izštevanko
        for (int krog = 1; krog <= stKrogov; krog++) {
            // ugotovi, kdo izpade
            int ixIzpadlega = (stBesed - 1) % stOtrok;
            System.out.println(otroci.get(ixIzpadlega));

            // izloči izpadlega
            otroci.remove(ixIzpadlega);
            stOtrok--;
        }
    }
}
