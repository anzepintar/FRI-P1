import java.util.Arrays;

public class Stanovanje {
    private static final int MAX_ST_STANOVALCEV = 10000;
    private Oseba[] stanovalci;
    private Stanovanje[] sosedi;
    private int vrstica;
    private int stolpec;
    private boolean obiskano;

    public Stanovanje(Oseba[] stanovalci) {
        this.stanovalci = stanovalci;
        this.sosedi = null;
    }

    public void setObiskano(boolean obiskano) {
        this.obiskano = obiskano;
    }

    public boolean getObiskano() {
        return this.obiskano;
    }

    public Stanovanje[] getSosedi() {
        return this.sosedi;
    }

    public void nastaviKoordinati(int vrstica, int stolpec) {
        this.vrstica = vrstica;
        this.stolpec = stolpec;
    }

    public int[] vrniKoordinati() {
        return new int[] { this.vrstica, this.stolpec };
    }

    public int steviloStanovalcev() {
        return this.stanovalci.length;
    }

    public int steviloStarejsihOd(Oseba os) {
        int starejsi = 0;
        for (int i = 0; i < this.stanovalci.length; i++) {
            if (this.stanovalci[i].jeStarejsaOd(os))
                starejsi++;
        }
        return starejsi;
    }

    public int[] mz() {
        int[] spol = new int[2];
        for (int i = 0; i < stanovalci.length; i++) {
            if (this.stanovalci[i].getSpol() == 'M')
                spol[0]++;
            else
                spol[1]++;
        }
        return spol;
    }

    public Oseba starosta() {
        if (this.stanovalci.length == 0) {
            return null;
        }
        Oseba naj = this.stanovalci[0];
        for (Oseba os : this.stanovalci) {
            if (os.jeStarejsaOd(naj)) {
                naj = os;
            }
        }
        return naj;
    }

    public void nastaviSosede(Stanovanje levi, Stanovanje zgornji,
            Stanovanje desni, Stanovanje spodnji) {
        this.sosedi = new Stanovanje[] {
                levi, zgornji, desni, spodnji
        };
    }

    public Oseba starostaSosescine() {
        Oseba naj = this.starosta();
        for (Stanovanje s : this.sosedi) {
            if (s != null) {
                Oseba najSosed = s.starosta();
                if (najSosed != null) {
                    if (naj == null || najSosed.jeStarejsaOd(naj)) {
                        naj = najSosed;
                    }
                }
            }
        }
        return naj;
    }

    public Oseba[] sosedjeSosedov() {
        Stanovanje[] obiskanaStanovanja = new Stanovanje[20];
        int stObiskanihStanovanj = 0;
        obiskanaStanovanja[stObiskanihStanovanj++] = this;
        Oseba[] osebe = new Oseba[MAX_ST_STANOVALCEV];
        int stOseb = 0; // število oseb v sosedih sosedov stanovanja this
        for (Stanovanje s : this.sosedi) {
            if (s != null) {
                for (Stanovanje ss : s.sosedi) {
                    if (ss != null && !vsebuje(obiskanaStanovanja, ss)) {
                        obiskanaStanovanja[stObiskanihStanovanj++] = ss;
                        System.arraycopy(ss.stanovalci, 0, osebe, stOseb,
                                ss.steviloStanovalcev());
                        stOseb += ss.steviloStanovalcev();
                    }
                }
            }
        }
        return Arrays.copyOf(osebe, stOseb);
    }

    private static boolean vsebuje(Stanovanje[] tabela, Stanovanje stanovanje) {
        for (Stanovanje s : tabela) {
            if (s == stanovanje) {
                return true;
            }
        }
        return false;
    }
}
