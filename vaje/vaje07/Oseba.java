public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }

    public String vrniIme() {
        return this.ime;
    }

    public String toString() {
        return this.ime + " " + this.priimek + " (" + this.spol + "), " + letoRojstva;
    }

    public int starost(int leto) {
        return leto - this.letoRojstva;
    }

    public boolean jeStarejsaOd(Oseba os) {
        return this.letoRojstva < os.letoRojstva;
    }

    public static Oseba starejsa(Oseba a, Oseba b) {
        if (a.letoRojstva < b.letoRojstva)
            return a;
        else if (a.letoRojstva > b.letoRojstva)
            return b;
        else
            return null;
    }

    public String imeOceta() {
        return this.oce != null ? this.oce.ime : null;
    }

    public boolean jeBratAliSestraOd(Oseba os) {
        if (!this.equals(os))
            return this.oce.equals(os.oce) && this.mati.equals(os.mati);
        return false;
    }

    public boolean jeSestraOd(Oseba os) {
        return this.oce.equals(os.oce) && this.spol != 'M';
    }

    public boolean jeTetaOd(Oseba os) {
        if (os.oce.oce != null)
            return this.oce.equals(os.oce.oce);
        if (os.oce.mati != null)
            return this.oce.mati.equals(os.oce.mati);
        if (os.mati.oce != null)
            return this.mati.oce.equals(os.mati.oce);
        if (os.mati.mati != null)
            return this.mati.equals(os.mati.mati);
        return false;
    }

    public boolean jeOcetovskiPrednikOd(Oseba os) {
        Oseba nova = os;
        boolean prednik = false;
        while (nova.oce != null) {
            if (nova.oce == this)
                prednik = true;
            nova = nova.oce;
        }
        return prednik;
    }
}
