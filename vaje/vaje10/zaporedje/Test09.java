
public class Test09 {

    public static void main(String[] args) {
        int[] a = {3, -1, 2, -1, -1, 4, -1, 6, 7, -1, -1, 5, -1, -1, -1, 3, -1};
        Zaporedje p = new Tabela(a);

        int[] b = {-1, -1, 4, 8, 6, -1, 7, 5, 3, 4};
        Zaporedje q = new Tabela(b);

        Zaporedje r = p.vsota(q);
        System.out.println(r.vNiz(new Interval(0, a.length - 1)));
    }
}
