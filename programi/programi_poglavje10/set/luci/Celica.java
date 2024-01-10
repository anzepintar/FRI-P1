
//
// Razred za predstavitev posameznih celic.
//

public class Celica {

    // koordinati celice
    private int x;
    private int y;

    public Celica(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //
    // Vrne /true/ natanko v primeru, če objekta /this/ in /obj/ predstavljata
    // celici na istem položaju.
    //
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Celica)) {
            return false;
        }
        Celica celica = (Celica) obj;
        return this.x == celica.x && this.y == celica.y;
    }

    @Override
    public int hashCode() {
        return 17 * this.x + 31 * this.y;
    }
}
