public class Sprehod {
    public static void main(String[] args) {
        int[] t = { 10, 20, 30, 40, 50, 60, 10 };
        izpisi(t);
    }

    public static void izpisi(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.printf("Element na indeksu %d je %d.%n", i, t[i]);
        }
    }

    public static int indexMaksimuma(int[] t) {
        int iNaj = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i] > t[iNaj]) {
                iNaj = i;
            }
        }
        return iNaj;
    }

    public static void izpisieach(int[] t) {
        for (int element : t) {
            System.out.println(element);
        }
    }
}
