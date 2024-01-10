
public class Test06 {

    public static void main(String[] args) {
        int[] t = {3, -1, 2, -1, -1, 4, -1, 6, 7, -1, -1, 5, -1, -1, -1, 3, -1};
        Zaporedje tab = new Tabela(t);

        System.out.println(tab.jeMonotono(new Interval(0, 0)));
        System.out.println(tab.jeMonotono(new Interval(0, 1)));
        System.out.println(tab.jeMonotono(new Interval(0, 2)));
        System.out.println(tab.jeMonotono(new Interval(0, 4)));
        System.out.println(tab.jeMonotono(new Interval(0, 5)));
        System.out.println("----------");
        System.out.println(tab.jeMonotono(new Interval(1, 10)));
        System.out.println(tab.jeMonotono(new Interval(1, 11)));
        System.out.println(tab.jeMonotono(new Interval(7, 8)));
        System.out.println(tab.jeMonotono(new Interval(8, 16)));
        System.out.println(tab.jeMonotono(new Interval(12, 16)));
    }
}
