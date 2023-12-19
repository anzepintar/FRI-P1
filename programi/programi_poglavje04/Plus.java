
/*
 * Izpis "plusa" s krakom dolžine 4
 */

public class Plus {

    public static void main(String[] args) {
        // zgornji krak
        for (int i = 1;  i <= 4;  i++) {
            for (int j = 1;  j <= 4;  j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }

        // sredina
        for (int i = 1;  i <= 9;  i++) {
            System.out.print("+");
        }
        System.out.println();

        // spodnji krak
        for (int i = 1;  i <= 4;  i++) {
            for (int j = 1;  j <= 4;  j++) {
                System.out.print(" ");
            }
            System.out.println("+");
        }
    }
}
