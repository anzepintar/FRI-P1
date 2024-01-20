
import java.text.Collator;
import java.util.*;

public class Liga {

    private Collection<String> klubi;
    private Collection<Tekma> tekme;

    public Liga(Collection<String> klubi, Collection<Tekma> tekme) {
        this.klubi = klubi;
        this.tekme = tekme;
    }

    public int steviloTock(String klub) {
        int sum = 0;
        for (Tekma tekma : this.tekme) {
            if (klub.equals(tekma.getDomaci()) || klub.equals(tekma.getGostje()))
                sum += tekma.steviloTock(klub);
        }
        return sum;
    }

    public Slovar<String, Integer> klub2tocke() {
        Slovar<String, Integer> slovar = new Slovar<>();
        for (String klub : this.klubi) {
            slovar.shrani(klub, steviloTock(klub));
        }
        return slovar;
    }

    public List<String> lestvica() {
        ArrayList<String> seznam = new ArrayList<>(klubi);
        seznam.sort(new PrimerjalnikPoTockah(klub2tocke()));
        return seznam;
    }

    private static class PrimerjalnikPoTockah implements Comparator<String> {
        private Slovar<String, Integer> slovar;

        public PrimerjalnikPoTockah(Slovar<String, Integer> slovar) {
            this.slovar = slovar;
        }

        @Override
        public int compare(String prvi, String drugi) {
            int razlika = slovar.vrni(drugi) - slovar.vrni(prvi);
            // compareTo primerja Stringe leksikografsko
            return (razlika == 0) ? (prvi.compareTo(drugi)) : (razlika);
        }
    }

    public Iterator<Tekma> poTekmah(int minGR) {
        return new IteratorPoTekmah(this.tekme, minGR);
    }

    private static class IteratorPoTekmah implements Iterator<Tekma> {
        Iterator<Tekma> iterator;
        int minGR;
        Tekma naslednjaTekma;

        public IteratorPoTekmah(Collection<Tekma> tekme, int minGR) {
            this.iterator = tekme.iterator();
            this.minGR = minGR;
            this.naslednjaTekma = this.poisciNaslednjoTekmo();
        }

        private Tekma poisciNaslednjoTekmo() {
            while (this.iterator.hasNext()) {
                Tekma tekma = this.iterator.next();
                if (tekma.golrazlika() >= this.minGR) {
                    return tekma;
                }
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return this.naslednjaTekma != null;
        }

        @Override
        public Tekma next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            Tekma tekma = this.naslednjaTekma;
            this.naslednjaTekma = this.poisciNaslednjoTekmo();
            return tekma;
        }

    }
}
