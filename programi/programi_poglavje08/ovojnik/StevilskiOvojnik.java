
/*
 * Objekt tega razreda hrani element tipa T, ki mora biti podtip tipa Number
 * (ali enak tipu Number).
 */

public class StevilskiOvojnik<T extends Number> {

    private T a;

    public StevilskiOvojnik(T a) {
        this.a = a;
    }

    public T vrni() {
        return this.a;
    }

    // Tip T v parametru <drugi> mora biti isti kot tip T v objektu <this>.
    public boolean jeVecjiKot(StevilskiOvojnik<T> drugi) {
        // ker vemo, da je T tip Number ali njegov podtip, lahko uporabljamo
        // metode iz razreda Number
        return this.a.doubleValue() > drugi.a.doubleValue();
    }

    // Tip U v parametru <drugi> ni nujno enak tipu T, mora pa prav tako biti
    // podtip tipa Number (ali enak tipu Number).
    public <U extends Number> boolean jeVecjiKot2(StevilskiOvojnik<U> drugi) {
        return this.a.doubleValue() > drugi.a.doubleValue();
    }
}
