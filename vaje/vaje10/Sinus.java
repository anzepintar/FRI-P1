
public class Sinus extends Zaporedje {

    private double a;
    private double b;

    public Sinus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer y(int x) {
        return (int) (Math.round(this.a * Math.sin(this.b * x)));
    }
}
