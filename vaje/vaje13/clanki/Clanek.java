
import java.util.*;

public class Clanek {
    private List<Avtor> avtorji;
    private String naslov;
    private int leto;

    public Clanek(List<Avtor> avtorji, String naslov, int leto) {
        this.avtorji = avtorji;
        this.naslov = naslov;
        this.leto = leto;
    }

    public int getLeto() {
        return leto;
    }

    public String getNaslov() {
        return naslov;
    }

    public List<Avtor> getAvtorji() {
        return avtorji;
    }

    @Override
    public String toString() {
        String strAvtorji = this.avtorji.toString();
        return String.format("%s: %s (%d)",
                strAvtorji.substring(1, strAvtorji.length() - 1), this.naslov, this.leto);
    }
}
