
public class Test01 {

    public static void main(String[] args) {
        Zaporedje kvadrat = new Kvadrat();
        Zaporedje koren = new Koren();

        System.out.println(kvadrat.minMax(new Interval(-5, 3)));
        System.out.println(kvadrat.minMax(new Interval(-10, 10)));
        System.out.println(kvadrat.minMax(new Interval(-15, 42)));
        System.out.println(kvadrat.minMax(new Interval(5, 100)));
        System.out.println("----------");

        System.out.println(koren.minMax(new Interval(-10, 10)));
        System.out.println(koren.minMax(new Interval(-15, 42)));
        System.out.println(koren.minMax(new Interval(5, 100)));
        System.out.println("----------");

        System.out.println(koren.minMax(new Interval(24, 63)));
        System.out.println(koren.minMax(new Interval(25, 63)));
        System.out.println(koren.minMax(new Interval(26, 63)));
        System.out.println(koren.minMax(new Interval(24, 64)));
        System.out.println(koren.minMax(new Interval(25, 64)));
        System.out.println(koren.minMax(new Interval(26, 64)));
        System.out.println(koren.minMax(new Interval(24, 65)));
        System.out.println(koren.minMax(new Interval(25, 65)));
        System.out.println(koren.minMax(new Interval(26, 65)));
    }
}
