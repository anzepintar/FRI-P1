
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: ročno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

        // dopolnite ...
    }
}
