
import java.util.Scanner;

/*
 * Ta program uporabnika v zanki sprašuje po imenih. Če vnesenega imena še ni
 * videl, prebere še pripadajočo telefonsko številko, če ga je že, pa
 * telefonsko številko izpiše.
 */

public class TelefonskiImenik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // slovar, ki ime osebe preslika v njeno telefonsko
        // številko
        Slovar ime2stevilka = new Slovar();

        System.out.print("Vnesite ime: ");
        String ime = sc.nextLine();
        while (ime.length() > 0) {
            // pridobimo številko, povezano z vnesenim imenom
            // (če obstaja)
            String stevilka = (String) ime2stevilka.vrni(ime);

            if (stevilka == null) {
                // ime še ne obstaja, zato preberemo tel. številko
                // in shranimo par ime-številka v slovar
                System.out.print("Vnesite telefonsko številko: ");
                stevilka = sc.nextLine();
                ime2stevilka.shrani(ime, stevilka);
            } else {
                System.out.println(stevilka);
            }

            System.out.println();
            System.out.print("Vnesite ime: ");
            ime = sc.nextLine();
        }
    }
}
