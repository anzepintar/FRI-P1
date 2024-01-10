
/*
 * Objekt tega razreda predstavlja zaprti interval (spodnja in zgornja meja
 * sta del intervala).
 */

public class Interval {

    private int zacetek; // spodnja meja
    private int konec; // zgornja meja

    public Interval(int zacetek, int konec) {
        this.zacetek = zacetek;
        this.konec = konec;
    }

    public int vrniZacetek() {
        return this.zacetek;
    }

    public int vrniKonec() {
        return this.konec;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", this.zacetek, this.konec);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Interval)) {
            return false;
        }
        Interval drugi = (Interval) obj;
        return (this.zacetek == drugi.zacetek && this.konec == drugi.konec);
    }

    @Override
    public int hashCode() {
        return (17 * Integer.hashCode(this.zacetek) + 31 * Integer.hashCode(this.konec));
    }
}
