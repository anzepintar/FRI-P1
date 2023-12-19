abstract class Datoteka {
    private String ime;

    public Datoteka(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    abstract public int velikost();

    abstract public String toString();
}

class BesedilnaDatoteka extends Datoteka {
    private int stZnakov;

    public BesedilnaDatoteka(String ime, int stZnakov) {
        super(ime);
        this.stZnakov = stZnakov;
    }

    @Override
    public int velikost() {
        return this.stZnakov;
    }

    @Override
    public String toString() {
        return String.format("%s [b %d]", this.getIme(), this.velikost());
    }
}

class SlikovnaDatoteka extends Datoteka {
    private int sirina;
    private int visina;

    public SlikovnaDatoteka(String ime, int sirina, int visina) {
        super(ime);
        this.sirina = sirina;
        this.visina = visina;
    }

    public int getSirina() {
        return this.sirina;
    }

    public int getVisina() {
        return this.visina;
    }

    @Override
    public int velikost() {
        return 3 * this.sirina * this.visina + 54;
    }

    @Override
    public String toString() {
        return String.format("%s [s %d x %d]", this.getIme(), this.sirina, this.visina);
    }
}

class Imenik extends Datoteka {
    private Datoteka[] datoteke;

    public Imenik(String ime, Datoteka[] datoteke) {
        super(ime);
        this.datoteke = datoteke;
    }

    @Override
    public int velikost() {
        int sum = 256;
        for (int i = 0; i < datoteke.length; i++) {
            sum += datoteke[i].velikost();
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("%s [i %d]", this.getIme(), this.datoteke.length);
    }

    public int steviloVecjihSlik(int prag) {
        int stevilo = 0;
        for (int i = 0; i < this.datoteke.length; i++) {
            if (this.datoteke[i] instanceof SlikovnaDatoteka) {
                SlikovnaDatoteka s = (SlikovnaDatoteka) this.datoteke[i];
                if (s.getSirina() >= prag && s.getVisina() >= prag)
                    stevilo++;
            }
        }
        return stevilo;
    }

    public String poisci(String ime) {
        return poisci(".", ime);
    }

    private String poisci(String pot, String ime) {
        for (Datoteka f : this.datoteke) {
            if (f.getIme().equals(ime)) {
                return (pot + "/" + ime);
            }
        }

        for (Datoteka f : this.datoteke) {
            if (f instanceof Imenik) {
                Imenik imenik = (Imenik) f;
                String rezultat = imenik.poisci(pot + "/" + imenik.getIme(), ime);
                if (rezultat != null) {
                    return rezultat;
                }
            }
        }
        return null;
    }
}
