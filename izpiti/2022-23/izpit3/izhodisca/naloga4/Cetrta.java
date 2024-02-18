
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode zamenjaj
06--10: preverjanje implementacije vmesnika Iterable<T>
01--03, 06--08: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {

    public static class Miks<T> {
        private List<T> seznam;
        private Set<T> mnozica;

        public Miks(List<T> seznam, Set<T> mnozica) {
            this.seznam = seznam;
            this.mnozica = mnozica;
        }

        @Override
        public String toString() {
            return String.format("%s | %s", this.seznam, this.mnozica);
        }

        public List<T> vrniSeznam() {
            return this.seznam;
        }

        public Set<T> vrniMnozico() {
            return this.mnozica;
        }

        public void zamenjaj() {
            // dopolnite ...
        }
    }

    //=========================================================================

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
