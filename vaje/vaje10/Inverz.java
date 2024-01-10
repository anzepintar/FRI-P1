public class Inverz extends Zaporedje {
    private Interval interval;
    private Zaporedje f;

    public Inverz(Zaporedje zaporedje, Interval interval) {
        this.f = zaporedje;
        this.interval = interval;
    }

    @Override
    public Integer y(int x) {
        int zac = this.interval.vrniZacetek();
        int kon = this.interval.vrniKonec();
        for (int i = zac; i <= kon; i++) {
            Integer y = this.f.y(i);
            if (y != null && y == x) {
                return i;
            }
        }
        return null;
    }
}
