
public class Test03 {

    public static void main(String[] args) {
        int[] t = {3, -1, 2, -1, -1, 4, -1, 6, 7, -1, -1, 5, -1, -1, -1, 3, -1};
        Zaporedje tab = new Tabela(t);

        System.out.println(tab.minMax(new Interval(0, 0)));
        System.out.println(tab.minMax(new Interval(1, 4)));
        System.out.println(tab.minMax(new Interval(0, t.length - 1)));
    }
}
