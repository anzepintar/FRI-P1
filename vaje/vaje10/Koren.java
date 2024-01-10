
public class Koren extends Zaporedje {

    @Override
    public Integer y(int x) {
        int y = (int) Math.round(Math.sqrt(x));
        return (x == y * y) ? (y) : (null);
    }
}
