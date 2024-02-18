
import java.util.*;

public class Cetrta {

    public static class Avtomat {
        private String zacetnoStanje;
        private Set<String> sprejemnaStanja;
        private Map<String, Map<Character, String>> prehodi;

        public Avtomat(String zacetnoStanje, Set<String> sprejemnaStanja,
                Map<String, Map<Character, String>> prehodi) {

            this.zacetnoStanje = zacetnoStanje;
            this.sprejemnaStanja = sprejemnaStanja;
            this.prehodi = prehodi;
        }

        public String vrniZacetnoStanje() {
            return this.zacetnoStanje;
        }

        public Set<String> vrniSprejemnaStanja() {
            return this.sprejemnaStanja;
        }

        public Map<String, Map<Character, String>> vrniPrehode() {
            return this.prehodi;
        }

        public boolean jeSprejemno(String stanje) {
            // popravite / dopolnite ...
            return false;
        }

        public String kam(String beseda) {
            // popravite / dopolnite ...
            return "";
        }

        public static Avtomat zaBesedo(String beseda) {
            // popravite / dopolnite ...
            return null;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
