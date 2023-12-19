
/*
 * Objekt tega razreda hrani element tipa T.
 */

public class Ovojnik<T> {

    private T a;

    public Ovojnik(T a) {
        this.a = a;
    }

    public T vrni() {
        return this.a;
    }
}
