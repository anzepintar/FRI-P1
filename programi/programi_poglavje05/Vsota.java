
/*
 * Vsota elementov tabele
 */

public class Vsota {

    public static void main(String[] args) {
        int[] prodaja = {10, 30, 50, 20, 40};
        System.out.println(vsota(prodaja));
    }

    public static int vsota(int[] t) {
        int vsota = 0;
        for (int element: t) {
            vsota += element;
        }
        return vsota;
    }
}
