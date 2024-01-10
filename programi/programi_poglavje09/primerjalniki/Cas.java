
/*
 * Razred Cas, dopolnjen tako, da implementira vmesnik Comparable.
 */

public class Cas implements Comparable<Cas> {
    private int ura;
    private int minuta;

    public Cas(int h, int min) {
        this.ura = h;
        this.minuta = min;
    }

    public int vrniUro() {
        return this.ura;
    }

    public int vrniMinuto() {
        return this.minuta;
    }

    // Implementacija metode compareTo iz vmesnika Comparable. Metoda vrne
    // negativno število, če je trenutek, ki ga predstavlja objekt <this>,
    // kronološko pred trenutkom, ki ga predstavlja objekt <drugi>, 0, če
    // objekta predstavljata isti trenutek, in pozitivno število, če trenutek
    // <this> kronološko sledi trenutku <drugi>.
    @Override
    public int compareTo(Cas drugi) {
        int minThis = 60 * this.ura + this.minuta;
        int minDrugi = 60 * drugi.ura + drugi.minuta;
        return minThis - minDrugi;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.ura, this.minuta);
    }

    @Override
    public boolean equals(Object drugi) {
        if (this == drugi) {
            return true;
        }
        if (!(drugi instanceof Cas)) {
            return false;
        }
        Cas drugiCas = (Cas) drugi;
        return this.ura == drugiCas.ura && this.minuta == drugiCas.minuta;
    }

    @Override
    public int hashCode() {
        return 17 * Integer.hashCode(this.ura) + 31 * Integer.hashCode(this.minuta);
    }
}
