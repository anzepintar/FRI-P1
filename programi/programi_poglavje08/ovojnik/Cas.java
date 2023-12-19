
/*
 * (Oskubljen) razred za predstavitev časovnih trenutkov v dnevu
 */

public class Cas {
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
