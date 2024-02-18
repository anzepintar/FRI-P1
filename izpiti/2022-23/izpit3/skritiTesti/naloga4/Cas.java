
import java.util.*;

public class Cas implements Comparable<Cas> {
    private int ure;
    private int minute;

    public Cas(int ure, int minute) {
        this.ure = ure;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.ure, this.minute);
    }

    @Override
    public int compareTo(Cas cas) {
        return 60 * (this.ure - cas.ure) + (this.minute - cas.minute);
    }
}
