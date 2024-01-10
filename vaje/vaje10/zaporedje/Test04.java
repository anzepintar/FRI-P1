
public class Test04 {

    public static void main(String[] args) {
        Zaporedje kvadrat = new Kvadrat();
        Zaporedje koren = new Koren();

        System.out.println(kvadrat.jeMonotono(new Interval(0, 0)));
        System.out.println(kvadrat.jeMonotono(new Interval(0, 10)));
        System.out.println(kvadrat.jeMonotono(new Interval(0, 100)));
        System.out.println(kvadrat.jeMonotono(new Interval(-100, 0)));
        System.out.println(kvadrat.jeMonotono(new Interval(-1, 1)));
        System.out.println("----------");

        System.out.println(koren.jeMonotono(new Interval(-10, -5)));
        System.out.println(koren.jeMonotono(new Interval(-10, 10)));
        System.out.println(koren.jeMonotono(new Interval(0, 10)));
        System.out.println(koren.jeMonotono(new Interval(10, 100)));
        System.out.println(koren.jeMonotono(new Interval(101, 120)));
        System.out.println("----------");
    }
}
