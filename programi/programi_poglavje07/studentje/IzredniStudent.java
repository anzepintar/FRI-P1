
/*
 * Objekt tega razreda predstavlja izrednega študenta.
 */

public class IzredniStudent extends Student {
    // IzredniStudent že samo zaradi dedovanja vsebuje atribute 
    // ip, vpisna in stroskiBivanja ter metodi vrniIP in stroski.

    // mesečna šolnina
    private int solnina;

    // konstruktor
    public IzredniStudent(String ip, String vpisna, 
                          int stroskiBivanja, int solnina) {
        // Pokličemo konstruktor nadrazreda in mu posredujemo
        // parametre ip, vpisna in stroskiBivanja.  Konstruktor
        // nadrazreda bo objektu, ki ga je <new> pravkar ustvaril,
        // nastavil pripadajoče atribute.
        super(ip, vpisna, stroskiBivanja);
        this.solnina = solnina;
    }

    // redefinirana metoda
    @Override
    public int stroski() {
        return super.stroski() + this.solnina;
    }
}
