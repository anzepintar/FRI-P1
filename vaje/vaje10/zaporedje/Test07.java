
public class Test07 {

    public static void main(String[] args) {
        Zaporedje kvadrat = new Kvadrat();
        Zaporedje koren = new Koren();

        Zaporedje v1 = kvadrat.vsota(kvadrat);
        Zaporedje v2 = kvadrat.vsota(koren);
        Zaporedje v3 = koren.vsota(koren);

        System.out.println(v1.vNiz(new Interval(-10, 10)));
        System.out.println(v2.vNiz(new Interval(0, 100)));
        System.out.println(v3.vNiz(new Interval(0, 100)));
    }
}
