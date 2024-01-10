
public class Test02 {

    public static void main(String[] args) {
        Zaporedje lin1 = new LinearnaFunkcija(3, 1);
        Zaporedje lin2 = new LinearnaFunkcija(-5, 2);

        Zaporedje sin1 = new Sinus(10, Math.PI / 4.0);
        Zaporedje sin2 = new Sinus(20, Math.PI / 3.0);
        Zaporedje sin3 = new Sinus(20, Math.PI / 30.0);

        System.out.println(lin1.minMax(new Interval(-10, 10)));
        System.out.println(lin2.minMax(new Interval(-10, 10)));
        System.out.println("----------");

        System.out.println(sin1.minMax(new Interval(-100, 100)));
        System.out.println(sin2.minMax(new Interval(-100, 100)));
        System.out.println(sin3.minMax(new Interval(-100, 100)));
        System.out.println("----------");

        System.out.println(sin1.minMax(new Interval(1, 1)));
        System.out.println(sin2.minMax(new Interval(1, 1)));
        System.out.println(sin3.minMax(new Interval(1, 1)));
    }
}
