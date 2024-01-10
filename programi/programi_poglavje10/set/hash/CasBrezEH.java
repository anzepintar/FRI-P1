
//
// Poenostavljen razred Cas. Razred ne vsebuje metod equals in hashCode.
//

public class CasBrezEH {
    private int ura;
    private int minuta;

    public CasBrezEH(int ura, int minuta) {
        this.ura = ura;
        this.minuta = minuta;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.ura, this.minuta);
    }
}
