
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-03: razdalja2
04-06: poPredpisih
07-10: najTip
01, 04, 07: ro"cno izdelani
*/

import java.util.*;

public class Tretja {

    //=========================================================================

    public static class Igrisce {
        private Igralo[] igrala;

        public Igrisce(Igralo[] igrala) {
            this.igrala = igrala;
        }

        public boolean poPredpisih() {
            // popravite / dopolnite ...
            return false;
        }

        public int najTip() {
            // popravite / dopolnite ...
            return -1;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static abstract class Igralo {
        private int x;
        private int y;

        protected Igralo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public abstract int minRazdalja2();

        public int razdalja2(Igralo igr) {
            // popravite / dopolnite ...
            return -1;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Gugalnica extends Igralo {
        public Gugalnica(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 200 * 200;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Tobogan extends Igralo {
        public Tobogan(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 150 * 150;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Plezalo extends Igralo {
        public Plezalo(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 130 * 130;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Vzmetnik extends Igralo {
        public Vzmetnik(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 100 * 100;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
