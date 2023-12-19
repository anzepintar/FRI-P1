
/*
 * Najprej izpiše znake z ASCII-kodami od 33 do 126, nato pa še črke od A do Z
 * (v angleški abecedi).
 */

public class ZaporedjeZnakov {

    public static void main(String[] args) {
        for (int koda = 33;  koda <= 126;  koda++) {
            System.out.println(koda + ": " + (char) koda);
        }

        for (char znak = 'A';  znak <= 'Z';  znak++) {
            System.out.print(znak);
        }
        System.out.println();
    }
}
