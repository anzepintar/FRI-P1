
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }
    }


    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            ArrayList<String> seznam = new ArrayList<>();
            for (Najdba najdba : this.najdbe) {
                seznam.add(najdba.vrniNajditelja());
            }
            return seznam.toArray(new String[this.najdbe.length]);
        }

        @Override
        public String toString() {
            return this.id;
        }
    }


    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            double pot = 0.0;
            pot += razdalja(zacetna, this.zakladi[0].vrniPolozaj());
            for (int i = 0; i < zakladi.length - 1; i++) {
                pot += razdalja(this.zakladi[i].vrniPolozaj(), this.zakladi[i + 1].vrniPolozaj());
            }
            pot += razdalja(this.zakladi[zakladi.length - 1].vrniPolozaj(), zacetna);
            return pot;
        }

        public static double razdalja(Tocka a, Tocka b) {
            return Math.sqrt(Math.pow(a.vrniX() - b.vrniX(), 2) + Math.pow(a.vrniY() - b.vrniY(), 2));
        }

        public Zaklad nazadnjeOdkrit() {
            int max = this.zakladi[0].vrniNajdbe()[0].vrniCas();
            Zaklad zadnji = null;
            for (Zaklad z : this.zakladi) {
                if (z.vrniNajdbe().length != 0) {
                    if (z.vrniNajdbe()[0].vrniCas() > max) {
                        max = z.vrniNajdbe()[0].vrniCas();
                        zadnji = z;
                    }
                }

            }
            return zadnji;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
