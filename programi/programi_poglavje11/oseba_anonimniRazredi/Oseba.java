
/*
 * Primerjalniki so predstavljeni kot objekti anonimnih notranjih razredov.
 */

import java.util.*;

public class Oseba {

    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;

    public Oseba(String ime, String priimek, char spol, int letoRojstva) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%c), %d", this.ime, this.priimek,
                this.spol, this.letoRojstva);
    }

    public static Comparator<Oseba> primerjalnikPoPriimku() {
        return new Comparator<Oseba>() {
            @Override
            public int compare(Oseba prva, Oseba druga) {
                return prva.priimek.compareTo(druga.priimek);
            }
        };
    }

    public static Comparator<Oseba> primerjalnikPoSpoluInStarosti() {
        return new Comparator<Oseba>() {
            @Override
            public int compare(Oseba prva, Oseba druga) {
                if (prva.spol != druga.spol) {
                    return druga.spol - prva.spol;
                }
                return prva.letoRojstva - druga.letoRojstva;
            }
        };
    }
}
