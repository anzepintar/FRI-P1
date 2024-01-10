
public class Test05 {

    public static void main(String[] args) {
        Zaporedje lin1 = new LinearnaFunkcija(3, 1);
        Zaporedje lin2 = new LinearnaFunkcija(-5, 2);

        Zaporedje sin1 = new Sinus(10, Math.PI / 4.0);
        Zaporedje sin2 = new Sinus(20, Math.PI / 3.0);
        Zaporedje sin3 = new Sinus(20, Math.PI / 30.0);

        System.out.println(lin1.jeMonotono(new Interval(0, 0)));
        System.out.println(lin1.jeMonotono(new Interval(-10, 10)));
        System.out.println(lin1.jeMonotono(new Interval(-100, 200)));
        System.out.println("----------");

        System.out.println(lin2.jeMonotono(new Interval(0, 0)));
        System.out.println(lin2.jeMonotono(new Interval(-10, 10)));
        System.out.println(lin2.jeMonotono(new Interval(-100, 200)));
        System.out.println("----------");

        System.out.println(sin1.jeMonotono(new Interval(0, 2)));
        System.out.println(sin1.jeMonotono(new Interval(0, 3)));
        System.out.println(sin1.jeMonotono(new Interval(2, 4)));
        System.out.println(sin1.jeMonotono(new Interval(5, 7)));
        System.out.println("----------");

        System.out.println(sin2.jeMonotono(new Interval(0, 2)));
        System.out.println(sin2.jeMonotono(new Interval(1, 2)));
        System.out.println(sin2.jeMonotono(new Interval(2, 2)));
        System.out.println("----------");

        System.out.println(sin3.jeMonotono(new Interval(-13, 13)));
        System.out.println(sin3.jeMonotono(new Interval(-14, 14)));
        System.out.println(sin3.jeMonotono(new Interval(33, 40)));
    }
}
