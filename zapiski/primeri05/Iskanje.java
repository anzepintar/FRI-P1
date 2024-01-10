public class Iskanje {
    public static void main(String[] args) {
        int[] tabela = { 7, 10, 15, 21, 27, 30, 31, 34, 37, 39, 42, 50, 58, 61, 75 };
        System.out.println(poisci(tabela, 42));
        System.out.println(poisci2(tabela, 29));
        System.out.println(poisciDvojisko(tabela, 29));
    }

    public static int poisci(int[] t, int x) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int poisci2(int[] t, int x) {
        int i = 0;
        while (i < t.length && t[i] < x) {
            i++;
        }
        return (i < t.length && t[i] == x) ? i : -1;
    }

    public static int poisciDvojisko(int[] t, int x) {
        int lm = 0;
        int dm = t.length - 1;
        while (lm <= dm) {

        }
    }
}
