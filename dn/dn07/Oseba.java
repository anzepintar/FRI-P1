public class Oseba {
    private String ip;
    private char spol;
    private int starost;

    public Oseba(String ip, char spol, int starost) {
        this.ip = ip;
        this.spol = spol;
        this.starost = starost;
    }

    public String toString() {
        return String.format("%s, %c, %d", this.ip, this.spol, this.starost);
    }

    public boolean jeStarejsaOd(Oseba os) {
        return this.starost > os.starost;
    }

    public char getSpol() {
        return this.spol;
    }
}
