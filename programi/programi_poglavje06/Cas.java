
/*
 * Razred, čigar objekti predstavljajo časovne trenutke v dnevu.  Vsak
 * trenutek je določen z uro in minuto.
 */

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

    // Časovnemu trenutku <cas> (natančneje: časovnemu trenutku, ki ga
    // predstavlja objekt, na katerega kaže kazalec <cas>) prišteje <h> ur in
    // <min> minut.
    //
    // (Ta metoda nam ni najbolj všeč; raje imamo nestatično.)
    public static void pristejStatic(Cas cas, int h, int min) {
        int noviCasVMinutah = 60 * (cas.ura + h) + (cas.minuta + min);

        // noviCasVMinutah spravimo v interval [0, 1439]
        // (v javi je x % y < 0, če je x < 0)
        noviCasVMinutah = (noviCasVMinutah % 1440 + 1440) % 1440;

        // spremenimo atributa <ura> in <minuta> objekta <cas>
        // (oz. objekta, na katerega kaže kazalec <cas>)
        cas.ura = noviCasVMinutah / 60;
        cas.minuta = noviCasVMinutah % 60;
    }

    // Časovnemu trenutku <this> (natančneje: časovnemu trenutku, ki ga
    // predstavlja objekt, na katerega kaže kazalec <this>) prišteje <h> ur in
    // <min> minut.  (Da se ne bomo preveč zapletali, bomo v nadaljevanju
    // pisali kar "objekt <this>" ali "časovni trenutek <this>", a se moramo
    // zavedati, da je <this> samo kazalec na objekt.)
    //
    // Tudi ta metoda nam ni najbolj všeč: ker je v splošnem bolje, da so
    // objekti nespremenljivi, imamo raje metodo, ki vrne nov objekt (oz.
    // kazalec nanj).
    public void pristej(int h, int min) {
        int noviCasVMinutah = 60 * (this.ura + h) + (this.minuta + min);

        // noviCasVMinutah spravimo v interval [0, 1439]
        noviCasVMinutah = (noviCasVMinutah % 1440 + 1440) % 1440;

        // spremenimo atributa <ura> in <minuta> objekta <this>
        this.ura = noviCasVMinutah / 60;
        this.minuta = noviCasVMinutah % 60;
    }

    // Vrne kazalec na NOV objekt, ki predstavlja trenutek, ki je za <h> ur in
    // <min> minut premaknjen glede na objekt <this>.  Objekt <this> se ne
    // spremeni.
    public Cas plus(int h, int min) {
        int noviCasVMinutah = 60 * (this.ura + h) + (this.minuta + min);

        // noviCasVMinutah spravimo v interval [0, 1439]
        noviCasVMinutah = (noviCasVMinutah % 1440 + 1440) % 1440;

        int novaUra = noviCasVMinutah / 60;
        int novaMinuta = noviCasVMinutah % 60;
        Cas noviCas = new Cas(novaUra, novaMinuta);
        return noviCas;
    }

    // "Getter": vrne vrednost atributa <ura> objekta <this>.
    public int vrniUro() {
        return this.ura;
    }

    // "Getter": vrne vrednost atributa <minuta> objekta <this>.
    public int vrniMinuto() {
        return this.minuta;
    }

    // Ker želimo zagotoviti nespremenljivost objektov tipa Cas, "setterjev"
    // ne bomo definirali.  (V ta namen bi morali odstraniti tudi metodi
    // pristejStatic in pristej, a naj iz pedagoških razlogov ostaneta.)

    // Vrne niz oblike H:MM (v 24-urnem formatu) oziroma H:MM AM / H:MM PM (v
    // 12-urnem formatu), ki podaja človeku prijazno predstavitev časovnega
    // trenutka <this>.
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
        // return this == drugi; // <-- ne gre, ker moramo primerjati
        // vrednosti atributov, ne zgolj kazalca
        // (izraz this == drugi ima vrednost <false>, če kazalca <this> in
        // <drugi> kažeta na dva ločena objekta --- tudi v primeru, če imata
        // oba isti vrednosti atributov <ura> in <minuta>)
        return this.ura == drugi.ura && this.minuta == drugi.minuta;
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
        // krajša alternativa:
        return this.razlikaVMin(drugi) < 0;
    }

    public boolean jeManjsiAliEnakOd(Cas drugi) {
        return this.jeManjsiOd(drugi) || this.jeEnakKot(drugi);
    }
}
