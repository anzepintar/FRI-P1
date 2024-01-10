import javax.swing.text.DefaultStyledDocument.ElementSpec;

public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek; x <= konec; x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Interval minMax(Interval interval) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = interval.vrniZacetek(); i <= interval.vrniKonec(); i++) {
            if (this.y(i) != null && this.y(i) >= max)
                max = this.y(i);
            if (this.y(i) != null && this.y(i) <= min)
                min = this.y(i);
        }
        return new Interval(min, max);
    }

    /*
     * public boolean jeMonotono(Interval interval) {
     * boolean padajoce = false;
     * int zac = interval.vrniZacetek();
     * if (this.y(zac) != null && this.y(zac + 1) != null) {
     * if (this.y(zac) < this.y(zac + 1)) {
     * padajoce = true;
     * } else if (this.y(zac) > this.y(zac + 1)) {
     * padajoce = false;
     * } else {
     * return false;
     * }
     * }
     * 
     * for (int i = interval.vrniZacetek(); i <= interval.vrniKonec() - 1; i++) {
     * if (this.y(i) != null && this.y(i + 1) != null) {
     * if (padajoce) {
     * if (this.y(i) >= this.y(i + 1)) {
     * return false;
     * }
     * } else {
     * if (this.y(i) <= this.y(i + 1)) {
     * return false;
     * }
     * }
     * }
     * }
     * return true;
     * }
     */
    public boolean jeMonotono(Interval interval) {
        return this.jeMonotono(interval, 1) || this.jeMonotono(interval, -1);
    }

    private boolean jeMonotono(Interval interval, int smer) {
        int zac = interval.vrniZacetek();
        int kon = interval.vrniKonec();
        Integer yp = null;

        for (int i = zac; i <= kon; i++) {
            Integer y = this.y(i);
            if (y != null) {
                if (yp != null && y * smer <= yp * smer) {
                    return false;
                }
                yp = y;
            }
        }
        return true;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        return new Vsota(this, drugo);
    }

    public Zaporedje inverz(Interval interval) {
        if (!this.jeMonotono(interval)) {
            return null;
        }
        return new Inverz(this, interval);
    }
}
