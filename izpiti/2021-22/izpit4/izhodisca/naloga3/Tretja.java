
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02..04: kli"cejo samo metodo dolzinaVrste
 * 05..07: kli"cejo samo metodo steviloDokumentov
 * 08..10: kli"cejo samo metodo natisni
 *
 * Skriti testni primeri: 
 * 01..16: kli"cejo samo metodo dolzinaVrste
 * 17..33: kli"cejo samo metodo steviloDokumentov
 * 34..50: kli"cejo samo metodo natisni
 *
 * (Vsi testni primeri kli"cejo konstruktor in metodo prejmi, a ta dva se ne to"ckujeta.)
 */

import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Tiskalnik {

        // atributi (po potrebi) ...

        public Tiskalnik() {
            // dopolnite ...
        }

        public void prejmi(Pedagog pedagog, String dokument) {
            // dopolnite ...
        }

        public int dolzinaVrste() {
            // popravite / dopolnite ...
            return -1;
        }

        public int steviloDokumentov(Pedagog pedagog) {
            // popravite / dopolnite ...
            return -1;
        }

        public String natisni() {
            // popravite / dopolnite ...
            return "";
        }

        // pomo"zne metode (po potrebi) ...
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
