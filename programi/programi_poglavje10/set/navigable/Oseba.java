
//
// Razred za predstavitev posameznih oseb.
//

import java.util.*;

public class Oseba implements Comparable<Oseba> {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;

    //
    // Inicializira novoustvarjeni objekt tako, da predstavlja oseba s podanim
    // imenom, priimkom, spolom in letom rojstva.
    //
    public Oseba(String ime, String priimek, char spol, int letoRojstva) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
    }

    //
    // Vrne niz sledeče oblike:
    // ime priimek (spol), letoRojstva
    //
    @Override
    public String toString() {
        return String.format("%s %s (%c), %d",
                this.ime, this.priimek, this.spol, this.letoRojstva);
    }

    //
    // Primerja osebi /this/ in /druga/ po priimku (primarno) in imenu
    // (sekundarno). Vrne negativno število, če oseba /this/ sodi pred osebo
    // /druga/, 0, če se osebi po teh kriterijih med seboj ne razlikujeta, in
    // pozitivno število, če oseba /this/ sodi za osebo /druga/.
    //
    @Override
    public int compareTo(Oseba druga) {
        if (this.priimek.equals(druga.priimek)) {
            return this.ime.compareTo(druga.ime);
        }
        return this.priimek.compareTo(druga.priimek);
    }

    //
    // Razred za primerjavo oseb po priimku.
    //
    private static class PrimerjalnikPoPriimku implements Comparator<Oseba> {
        @Override
        public int compare(Oseba prva, Oseba druga) {
            return prva.priimek.compareTo(druga.priimek);
        }
    }

    //
    // Razred za primerjavo oseb po spolu (primarno) in starosti (sekundarno).
    //
    private static class PrimerjalnikPoSpoluInStarosti implements Comparator<Oseba> {
        @Override
        public int compare(Oseba prva, Oseba druga) {
            if (prva.spol != druga.spol) {
                return druga.spol - prva.spol;
            }
            return prva.letoRojstva - druga.letoRojstva;
        }
    }

    //
    // Vrne objekt za primerjavo oseb po priimku.
    //
    public static Comparator<Oseba> primerjalnikPoPriimku() {
        return new PrimerjalnikPoPriimku();
    }

    //
    // Vrne objekt za primerjavo oseb po spolu in starosti.
    //
    public static Comparator<Oseba> primerjalnikPoSpoluInStarosti() {
        return new PrimerjalnikPoSpoluInStarosti();
    }
}
