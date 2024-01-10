
//
// Program za vodenje bančnih komitentov in računov.
//

import java.util.*;

public class Glavni {

    public static void main(String[] args) {
        Banka banka = new Banka();
        Scanner sc = new Scanner(System.in);

        // po vrsti beremo in izvršujemo ukaze
        while (sc.hasNextLine()) {
            String vrstica = sc.nextLine().strip();
            String[] deli = vrstica.split("\\s+");

            switch (deli[0]) {
                case "nk":
                    banka.dodajKomitenta(deli[1], deli[2]);
                    break;

                case "nr":
                    banka.dodajRacun(deli[1], deli[2]);
                    break;

                case "+":
                    banka.polog(deli[1], Integer.parseInt(deli[2]));
                    break;

                case "-":
                    banka.dvig(deli[1], Integer.parseInt(deli[2]));
                    break;

                case "->":
                    banka.prenos(deli[1], deli[2],
                                 Integer.parseInt(deli[3]));
                    break;

                case "?r": {
                    Racun racun = banka.racun(deli[1]);
                    System.out.println(racun.vrniStanje());
                    break;
                }

                case "?k":
                    System.out.println(banka.komitent(deli[1]));
                    break;
            }
        }
    }
}
