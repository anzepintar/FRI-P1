
public class Test08 {

    public static void main(String[] args) {
        Zaporedje lin1 = new LinearnaFunkcija(3, 1);
        Zaporedje lin2 = new LinearnaFunkcija(-5, 2);

        Zaporedje sin1 = new Sinus(10, Math.PI / 4.0);
        Zaporedje sin2 = new Sinus(20, Math.PI / 3.0);
        Zaporedje sin3 = new Sinus(20, Math.PI / 30.0);

        Zaporedje v1 = lin1.vsota(lin2);
        Zaporedje v2 = sin1.vsota(sin2);
        Zaporedje v3 = sin1.vsota(sin3);
        Zaporedje v4 = sin2.vsota(sin3);

        System.out.println(v1.vNiz(new Interval(-10, 10)));
        System.out.println(v2.vNiz(new Interval(-10, 10)));
        System.out.println(v3.vNiz(new Interval(-10, 10)));
        System.out.println(v4.vNiz(new Interval(-10, 10)));
    }
}
