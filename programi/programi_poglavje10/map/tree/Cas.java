
//
// Razred, katerega objekti predstavljajo posamezne časovne trenutke znotraj
// dneva.
//

public class Cas implements Comparable<Cas> {
    private int ura;
    private int minuta;

    private static boolean zapis12 = false;

    //
    // Konstruktor. Novoustvarjeni objekt inicializira tako, da bo
    // predstavljal trenutek ob uri /h/ in minuti /min/.
    //
    public Cas(int h, int min) {
        this.ura = h;
        this.minuta = min;
    }

    //
    // Konstruktor, ki novoustvarjenemu trenutku nastavi samo uro, minuto pa
    // pusti na 0.
    //
    public Cas(int h) {
        this(h, 0);
    }

    //
    // Vrne /true/ natanko v primeru, če objekt /this/ predstavlja isti
    // časovni trenutek kot objekt /drugi/.
    //
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

    //
    // Vrne število, ki zagotavlja, da za vsak par objektov a in b tipa Cas
    // velja a.equals(b) ==> a.hashCode() == b.hashCode() in da implikacija
    // čimvečkrat velja tudi v obratni smeri.
    //
    @Override
    public int hashCode() {
        return 17 * Integer.hashCode(this.ura) +
               31 * Integer.hashCode(this.minuta);
    }

    //
    // Trenutku /this/ prišteje /h/ ur in /min/ minut.
    //
    public static void pristejStatic(Cas cas, int h, int min) {
        int noviCas = 60 * (cas.ura + h) + (cas.minuta + min);
        noviCas = (noviCas % 1440 + 1440) % 1440;
        cas.ura = noviCas / 60;
        cas.minuta = noviCas % 60;
    }

    //
    // Trenutku /this/ prišteje /h/ ur in /min/ minut.
    //
    public void pristej(int h, int min) {
        int noviCas = 60 * (this.ura + h) + (this.minuta + min);
        noviCas = (noviCas % 1440 + 1440) % 1440;
        this.ura = noviCas / 60;
        this.minuta = noviCas % 60;
    }

    //
    // Vrne uro trenutka /this/.
    //
    public int vrniUro() {
        return this.ura;
    }

    //
    // Vrne minuto trenutka /this/.
    //
    public int vrniMinuto() {
        return this.minuta;
    }

    //
    // Nastavi uro trenutka /this/ na vrednost /h/.
    //
    public void nastaviUro(int h) {
        this.ura = h;
    }

    //
    // Nastavi minuto trenutka /this/ na vrednost /min/.
    //
    public void nastaviMinuto(int min) {
        this.minuta = min;
    }

    //
    // Vrne trenutek, ki ga dobimo, če trenutku /this/ prištejemo /h/ ur in
    // /min/ minut.  Trenutka /this/ ne spremeni.
    //
    public Cas plus(int h, int min) {
        int noviCas = 60 * (this.ura + h) + (this.minuta + min);
        noviCas = (noviCas % 1440 + 1440) % 1440;
        int novaUra = noviCas / 60;
        int novaMinuta = noviCas % 60;
        return new Cas(novaUra, novaMinuta);
    }

    //
    // Izpiše niz oblike h:mm, ki predstavlja trenutek /this/.
    //
    public void izpisi() {
        System.out.printf("%d:%02d", this.ura, this.minuta);
    }

    //
    // Vrne niz oblike h:mm, ki predstavlja trenutek /this/.
    //
    public String toString() {
        if (zapis12) {
            // 12-urni zapis
            String pripona = (this.ura < 12) ? ("AM") : ("PM");
            int h = (this.ura + 11) % 12 + 1;
            return String.format("%d:%02d %s", h, this.minuta, pripona);
        }
        // 24-urni zapis
        return String.format("%d:%02d", this.ura, this.minuta);
    }

    //
    // Vrne /true/ natanko v primeru, če kazalca /this/ in /drugi/ kažeta na
    // isti objekt.
    //
    public boolean jeEnakKot_poskus(Cas drugi) {
        return this == drugi;
    }

    //
    // Vrne /true/ natanko v primeru, če objekta /this/ in /drugi/
    // predstavljata isti časovni trenutek. (Kazalca /this/ in /drugi/ lahko
    // kažeta na isti objekt ali pa na dva ločena objekta z isto vsebino.)
    //
    public boolean jeEnakKot(Cas drugi) {
        return this.ura == drugi.ura && this.minuta == drugi.minuta;
    }

    //
    // Vrne razliko (v minutah) med trenutkoma /this/ in /drugi/.
    //
    public int razlikaVMin(Cas drugi) {
        return (this.ura - drugi.ura) * 60 + this.minuta - drugi.minuta;
    }

    //
    // Vrne /true/ natanko v primeru, če trenutek /this/ kronološko sodi pred
    // trenutek /drugi/.
    //
    public boolean jeManjsiOd(Cas drugi) {
        //return this.ura < drugi.ura ||
        //    (this.ura == drugi.ura && this.minuta < drugi.minuta);

        // krajše:
        return this.razlikaVMin(drugi) < 0;
    }

    //
    // Vrne /true/ natanko v primeru, če trenutek /this/ kronološko sodi pred
    // trenutek /drugi/ ali pa če sta trenutka enaka.
    //
    public boolean jeManjsiAliEnak(Cas drugi) {
        return this.jeManjsiOd(drugi) || this.jeEnakKot(drugi);
    }

    //
    // Določi, da se bodo trenutki odslej izpisovali v 12-urni (če je da ==
    // true) oziroma 24-urni (če je da == false) obliki.
    //
    public static void nastaviZapis12(boolean da) {
        zapis12 = da;
    }

    //
    // Vrne negativno število, če trenutek /this/ kronološko sodi pred
    // trenutek /drugi/, 0, če sta trenutka enaka, in pozitivno število, če
    // trenutek /this/ kronološko sodi za trenutek /drugi/.
    //
    @Override
    public int compareTo(Cas drugi) {
        return 60 * (this.ura - drugi.ura) + (this.minuta - drugi.minuta);
    }
}
