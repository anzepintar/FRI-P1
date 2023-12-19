
/*
 * Testni razred za razred StevilskiOvojnik
 */

public class TestStevilskiOvojnik {

    public static void main(String[] args) {
        StevilskiOvojnik<Integer> ov1 = new StevilskiOvojnik<>(5);
        StevilskiOvojnik<Integer> ov2 = new StevilskiOvojnik<>(3);
        StevilskiOvojnik<Double> ov3 = new StevilskiOvojnik<>(4.0);

        // OK
        System.out.println(ov1.jeVecjiKot(ov2));

        // Se ne prevede, ker tipni argument objekta ov3 (Double) ni enak
        // tipnemu argumentu objekta ov1 (Integer), metoda jeVecjiKot pa
        // zahteva, da sta oba tipa enaka.
        // System.out.println(ov1.jeVecjiKot(ov3));

        // OK
        System.out.println(ov1.jeVecjiKot2(ov3));

        // OK
        System.out.println(ov1.jeVecjiKot2(ov3));
    }
}
