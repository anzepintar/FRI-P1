
//
// Poenostavljen razred Cas. Razred vsebuje metodi equals in hashCode.
//

public class CasEH {
    private int ura;
    private int minuta;

    public CasEH(int ura, int minuta) {
        this.ura = ura;
        this.minuta = minuta;
    }

    public boolean equals(Object drugi) {
        if (this == drugi) {
            return true;
        }
        if (!(drugi instanceof CasEH)) {
            return false;
        }
        CasEH drugiCas = (CasEH) drugi;
        return this.ura == drugiCas.ura && this.minuta == drugiCas.minuta;
    }

    @Override
    public int hashCode() {
        return 17 * Integer.hashCode(this.ura) + 
               31 * Integer.hashCode(this.minuta);
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.ura, this.minuta);
    }
}
