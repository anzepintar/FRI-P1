
import java.util.*;

public class Tekma {

    private String domaci;
    private String gostje;
    private int goliDomacih;
    private int goliGostov;

    public Tekma(String domaci, String gostje, int goliDomacih, int goliGostov) {
        this.domaci = domaci;
        this.gostje = gostje;
        this.goliDomacih = goliDomacih;
        this.goliGostov = goliGostov;
    }

    public String getDomaci() {
        return domaci;
    }

    public String getGostje() {
        return gostje;
    }

    public int steviloTock(String klub) {
        if (klub.equals(gostje)) {
            if (goliGostov > goliDomacih)
                return 3;
            if (goliDomacih == goliGostov)
                return 1;
        }
        if (klub.equals(domaci)) {
            if (goliDomacih > goliGostov)
                return 3;
            if (goliDomacih == goliGostov)
                return 1;
        }
        return 0;

    }

    public int golrazlika() {
        return Math.abs(this.goliDomacih - this.goliGostov);
    }

    @Override
    public String toString() {
        return String.format("%s %d : %d %s", this.domaci, this.goliDomacih,
                this.goliGostov, this.gostje);
    }
}
