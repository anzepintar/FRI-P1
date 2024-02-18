
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static class Tocka {
        private int x;
        private int y;

        public Tocka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.x, this.y);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tocka)) {
                return false;
            }
            Tocka druga = (Tocka) obj;
            return this.x == druga.x && this.y == druga.y;
        }

        @Override
        public int hashCode() {
            return 17 * this.x + 31 * this.y;
        }

        public Map<Boolean, List<Tocka>> razdeli(Collection<Tocka> tocke) {
            // popravite / dopolnite ...
            return null;
        }

        public static Comparator<Tocka> polarno() {
            // popravite / dopolnite ...
            return null;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
