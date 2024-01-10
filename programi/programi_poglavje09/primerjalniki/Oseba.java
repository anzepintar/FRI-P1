
import java.util.*;

public class Oseba implements Comparable<Oseba> {

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
    public int compareTo(Oseba druga) {
        // primarno po priimkih, sekundarno po imenih
        if (this.priimek.equals(druga.priimek)) {
            return this.ime.compareTo(druga.ime);
        }
        return this.priimek.compareTo(druga.priimek);
    }

    @Override
    public String toString() {
        return String.format("%s %s (%c) / %d", 
                this.ime, this.priimek, this.spol, this.letoRojstva);
    }

    private static class PrimerjalnikPoPriimku implements Comparator<Oseba> {
        @Override
        public int compare(Oseba prva, Oseba druga) {
            return prva.priimek.compareTo(druga.priimek);
        }
    }

    public static Comparator<Oseba> primerjalnikPoPriimku() {
        return new PrimerjalnikPoPriimku();
    }

    private static class PrimerjalnikPoSpoluInStarosti implements Comparator<Oseba> {
        @Override
        public int compare(Oseba prva, Oseba druga) {
            if (prva.spol == druga.spol) {
                return prva.letoRojstva - druga.letoRojstva;  // najprej starejši, potem mlajši
            }
            return druga.spol - prva.spol;   // najprej ženske, potem moški
        }
    }

    public static Comparator<Oseba> primerjalnikPoSpoluInStarosti() {
        return new PrimerjalnikPoSpoluInStarosti();
    }
}
