
public class Cas {
    private int ura;
    private int minuta;

    // atribut, ki določa način izpisa trenutkov;
    // ta atribut ne pripada nobenemu objektu, ampak razredu kot celoti
    private static boolean zapis12 = false;

    public static void nastaviZapis12(boolean novaVrednost) {
        zapis12 = novaVrednost;    // brez this!
    }

    // konstruktor
    public Cas(int h, int min) {
        this.ura = h;
        this.minuta = min;
    }

    // Vrne NOV objekt, ki predstavlja trenutek, ki je za h ur in min minut
    // premaknjen glede na objekt, na katerega kaže this.
    public Cas plus(int h, int min) {
        int noviCasVMinutah = 60 * (this.ura + h) + (this.minuta + min);

        // noviCasVMinutah spravimo v interval [0, 1439]
        noviCasVMinutah = (noviCasVMinutah % 1440 + 1440) % 1440;

        // spremenimo atributa <ura> in <minuta> objekta <this>
        // (oz. objekta, na katerega kaže kazalec <this>)
        int novaUra = noviCasVMinutah / 60;
        int novaMinuta = noviCasVMinutah % 60;
        Cas noviCas = new Cas(novaUra, novaMinuta);
        return noviCas;
    }

    public int vrniUro() {
        return this.ura;
    }

    public int vrniMinuto() {
        return this.minuta;
    }

    @Override
    public String toString() {
        if (zapis12) {   // ne this.zapis12!
            String pripona = (this.ura < 12) ? ("AM") : ("PM");
            int h = (this.ura + 11) % 12 + 1;
            return String.format("%d:%02d %s", h, this.minuta, pripona);
        }
        return String.format("%d:%02d", this.ura, this.minuta);
    }

    // Vrne <true> natanko v primeru, če objekt <this> predstavlja isti časovni
    // trenutek kot objekt <drugi>.
    public boolean jeEnakKot(Cas drugi) {
        // return this == drugi;
        // primerjati moramo vrednosti atributov, ne zgolj kazalca
        return this.ura == drugi.ura && this.minuta == drugi.minuta;
    }

    @Override
    public boolean equals(Object drugi) {
        if (this == drugi) {
            return true;
        }
        if (!(drugi instanceof Cas)) {
            return false;   
            // objekt tipa Cas lahko primerjamo samo z 
            // objektom tipa Cas
        }
        Cas drugiCas = (Cas) drugi;
        return this.ura == drugiCas.ura && 
               this.minuta == drugiCas.minuta;
    }

    @Override
    public int hashCode() {
        return 17 * Integer.hashCode(this.ura) + 
               31 * Integer.hashCode(this.minuta);
    }

    // Vrne razliko med trenutkoma <this> in <drugi> v minutah.
    public int razlikaVMin(Cas drugi) {
        return (this.ura - drugi.ura) * 60 + 
               (this.minuta - drugi.minuta);
    }

    // Vrne <true> natanko v primeru, ko je trenutek <this>
    // kronološko pred trenutkom <drugi>.
    public boolean jeManjsiOd(Cas drugi) {
        /*
        return this.ura < drugi.ura ||
            this.ura == drugi.ura && this.minuta < drugi.minuta;
            */
        return this.razlikaVMin(drugi) < 0;
    }

    public boolean jeManjsiAliEnakOd(Cas drugi) {
        return this.jeManjsiOd(drugi) || this.jeEnakKot(drugi);
    }
}
