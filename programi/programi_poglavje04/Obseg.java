
/*
 * Definicija in uporaba metode, ki vrne obseg pravokotnika
 */

public class Obseg {

    public static void main(String[] args) {
        int ob = obseg(3, 4);
        System.out.println(ob);

        if (obseg(7, 2) > ob) {
            System.out.println("Pravokotnik 7 x 2 ima večji obseg kot pravokotnik 3 x 4");
        } else {
            System.out.println("Pravokotnik 7 x 2 ima manjši obseg kot pravokotnik 3 x 4");
        }
    }

    // Vrne obseg pravokotnika s stranicama a in b.
    public static int obseg(int a, int b) {
        return 2 * (a + b);
    }
}
