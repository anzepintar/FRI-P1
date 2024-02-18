
public class Cas implements Comparable<Cas> {

    private int ura;
    private int minuta;

    public Cas(int ura, int minuta) {
        this.ura = ura;
        this.minuta = minuta;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.ura, this.minuta);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cas)) {
            return false;
        }
        return this.vMinute() == ((Cas) obj).vMinute();
    }

    @Override
    public int hashCode() {
        return this.vMinute();
    }

    @Override
    public int compareTo(Cas drugi) {
        return this.vMinute() - drugi.vMinute();
    }

    private int vMinute() {
        return 60 * this.ura + this.minuta;
    }
}
