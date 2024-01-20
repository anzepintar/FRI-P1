
import java.util.*;

public class Avtor {
    private String ime;
    private String priimek;

    public Avtor(String ime, String priimek) {
        this.ime = ime;
        this.priimek = priimek;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.priimek;
    }
}
